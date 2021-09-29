package co.com.sofka.PetProject.venta.commands;

import co.com.sofka.PetProject.venta.values.*;
import co.com.sofka.domain.generic.Command;

public class actualizarProducto extends Command {
    private final VentaId ventaId;
    private final ProductoId productoId;
    private final Procedencia procedencia;
    private final Informacion informacion;
    private final Precio precio;

    public actualizarProducto(VentaId ventaId, ProductoId productoId, Procedencia procedencia, Informacion informacion, Precio precio) {
        this.ventaId = ventaId;
        this.productoId = productoId;
        this.procedencia = procedencia;
        this.informacion = informacion;
        this.precio = precio;
    }

    public VentaId getVentaId() {
        return ventaId;
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
