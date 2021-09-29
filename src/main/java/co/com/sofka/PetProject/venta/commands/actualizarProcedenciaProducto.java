package co.com.sofka.PetProject.venta.commands;

import co.com.sofka.PetProject.venta.values.Procedencia;
import co.com.sofka.PetProject.venta.values.ProductoId;
import co.com.sofka.PetProject.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;

public class actualizarProcedenciaProducto extends Command {
    private final VentaId ventaId;
    private final ProductoId productoId;
    private final Procedencia procedencia;

    public actualizarProcedenciaProducto(VentaId ventaId, ProductoId productoId, Procedencia procedencia) {
        this.ventaId = ventaId;
        this.productoId = productoId;
        this.procedencia = procedencia;
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
}
