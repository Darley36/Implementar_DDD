package co.com.sofka.PetProject.venta.events;

import co.com.sofka.PetProject.venta.values.Informacion;
import co.com.sofka.PetProject.venta.values.Precio;
import co.com.sofka.PetProject.venta.values.Procedencia;
import co.com.sofka.PetProject.venta.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoActualizado extends DomainEvent {
    private final ProductoId productoId;
    private final Procedencia procedencia;
    private final Informacion informacion;
    private final Precio precio;
    public ProductoActualizado(ProductoId productoId, Procedencia procedencia, Informacion informacion, Precio precio) {
        super("petproject.venta.productoactualizado");
        this.productoId = productoId;
        this.procedencia = procedencia;
        this.informacion = informacion;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public Precio getPrecio() {
        return precio;
    }
}
