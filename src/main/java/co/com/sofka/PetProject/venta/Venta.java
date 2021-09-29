package co.com.sofka.PetProject.venta;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.PetProject.venta.events.*;
import co.com.sofka.PetProject.venta.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Venta extends AggregateEvent<VentaId> {
    protected Set<Producto> productos;
    protected ClienteId clienteId;
    protected PersonalId personalId;

    /*public Venta(VentaId entityId) {
        super(entityId);
        appendChange(new VentaCreada()).apply();
    }*/

    private Venta(VentaId ventaId) {
        super(ventaId);
        appendChange(new VentaCreada()).apply();
        subscribe(new VentaChange(this));
    }

    public static Venta from(VentaId ventaId, List<DomainEvent> events){
        var venta = new Venta(ventaId);
        events.forEach(venta::applyEvent);
        return venta;
    }

    public void calcularTotal(Integer cantidad, Precio precio, Producto producto){
        Objects.requireNonNull(cantidad);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(producto);
        appendChange(new TotalCalculado(cantidad,precio,producto)).apply();
    }

    public void anadirProducto(ProductoId productoId, Procedencia procedencia, Informacion informacion, Precio precio){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(procedencia);
        Objects.requireNonNull(informacion);
        Objects.requireNonNull(precio);
        appendChange(new ProductoAnadido(productoId,procedencia,informacion,precio)).apply();
    }

    public void actualizarProducto(ProductoId productoId, Procedencia procedencia, Informacion informacion, Precio precio){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(procedencia);
        Objects.requireNonNull(informacion);
        Objects.requireNonNull(precio);
        appendChange(new ProductoActualizado(productoId,procedencia,informacion,precio)).apply();
    }

    public void actualizarProcedenciaProducto(ProductoId productoId,Procedencia procedencia){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(procedencia);
        appendChange(new ProcedenciaProductoActualizado(productoId,procedencia)).apply();
    }

    public void actualizarInformacionProducto(ProductoId productoId, Informacion informacion){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(informacion);
        appendChange(new InformacionProductoActualizado(productoId,informacion)).apply();
    }

    public void cambiarPrecioProducto(ProductoId productoId, Precio precio){
        Objects.requireNonNull(productoId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioProductoCambiado(productoId,precio)).apply();
    }

    public void asociarCliente(ClienteId clienteId){
        Objects.requireNonNull(clienteId);
        appendChange(new ClienteAsociado(clienteId)).apply();
    }

    public void asociarPersonal(PersonalId personalId){
        Objects.requireNonNull(personalId);
        appendChange(new PersonalAsociado(personalId)).apply();
    }

    protected Optional<Producto> getProductoById(ProductoId productoId){
        return productos()
                .stream().
                filter(producto -> producto.identity().equals(productoId))
                .findFirst();
    }

    public Set<Producto> productos() {
        return productos;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public PersonalId personalId() {
        return personalId;
    }
}
