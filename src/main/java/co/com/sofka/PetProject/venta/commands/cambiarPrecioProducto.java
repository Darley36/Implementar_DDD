package co.com.sofka.PetProject.venta.commands;

import co.com.sofka.PetProject.venta.values.Precio;
import co.com.sofka.PetProject.venta.values.ProductoId;
import co.com.sofka.PetProject.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;

public class cambiarPrecioProducto extends Command {
    private final VentaId ventaId;
    private final ProductoId productoId;
    private final Precio precio;

    public cambiarPrecioProducto(VentaId ventaId, ProductoId productoId, Precio precio) {
        this.ventaId = ventaId;
        this.productoId = productoId;
        this.precio = precio;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
