package co.com.sofka.PetProject.venta.commands;

import co.com.sofka.PetProject.venta.Producto;
import co.com.sofka.PetProject.venta.values.Precio;
import co.com.sofka.PetProject.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;

public class calcularTotal extends Command {
    private final VentaId ventaId;
    private final Integer cantidad;
    private final Precio precio;
    private final Producto producto;

    public calcularTotal(VentaId ventaId,Integer cantidad, Precio precio, Producto producto) {
        this.ventaId = ventaId;
        this.cantidad = cantidad;
        this.precio = precio;
        this.producto = producto;
    }

    public VentaId getVentaId() {
        return ventaId;
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
