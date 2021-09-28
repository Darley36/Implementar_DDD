package co.com.sofka.PetProject.venta.events;

import co.com.sofka.PetProject.venta.values.Informacion;
import co.com.sofka.PetProject.venta.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionProductoActualizado extends DomainEvent {
    private final ProductoId productoId;
    private final Informacion informacion;
    public InformacionProductoActualizado(ProductoId productoId, Informacion informacion) {
        super("petproject.venta.informacionproductoactualizado");
        this.productoId = productoId;
        this.informacion = informacion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
