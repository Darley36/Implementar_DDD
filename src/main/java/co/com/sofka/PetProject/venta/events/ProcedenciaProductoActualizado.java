package co.com.sofka.PetProject.venta.events;

import co.com.sofka.PetProject.venta.values.Procedencia;
import co.com.sofka.PetProject.venta.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProcedenciaProductoActualizado extends DomainEvent {
    private  final ProductoId productoId;
    private final Procedencia procedencia;
    public ProcedenciaProductoActualizado(ProductoId productoId, Procedencia procedencia) {
        super("procedenciaproductoactualizado");
        this.productoId = productoId;
        this.procedencia = procedencia;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }
}
