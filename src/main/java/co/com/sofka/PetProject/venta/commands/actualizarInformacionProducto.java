package co.com.sofka.PetProject.venta.commands;

import co.com.sofka.PetProject.venta.values.Informacion;
import co.com.sofka.PetProject.venta.values.ProductoId;
import co.com.sofka.PetProject.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;

public class actualizarInformacionProducto extends Command {
    private final VentaId ventaId;
    private final ProductoId productoId;
    private final Informacion informacion;

    public actualizarInformacionProducto(VentaId ventaId, ProductoId productoId, Informacion informacion) {
        this.ventaId = ventaId;
        this.productoId = productoId;
        this.informacion = informacion;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
