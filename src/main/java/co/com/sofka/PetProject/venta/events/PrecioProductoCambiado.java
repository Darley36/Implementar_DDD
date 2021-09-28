package co.com.sofka.PetProject.venta.events;

import co.com.sofka.PetProject.venta.values.Precio;
import co.com.sofka.PetProject.venta.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioProductoCambiado extends DomainEvent {
    private final ProductoId productoId;
    private final Precio precio;
    public PrecioProductoCambiado(ProductoId productoId, Precio precio) {
        super("petproject.venta.precioproductocambiado");
        this.productoId = productoId;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
