package co.com.sofka.PetProject.venta.events;

import co.com.sofka.PetProject.venta.Producto;
import co.com.sofka.PetProject.venta.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class TotalCalculado extends DomainEvent {
    private final Integer cantidad;
    private final Precio precio;
    private final Producto producto;
    public TotalCalculado(Integer cantidad, Precio precio, Producto producto) {
        super("petproject.venta.totalcalculado");
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Producto getProducto() {
        return producto;
    }
}
