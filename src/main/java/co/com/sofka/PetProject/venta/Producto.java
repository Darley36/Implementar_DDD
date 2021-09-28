package co.com.sofka.PetProject.venta;

import co.com.sofka.PetProject.venta.values.Informacion;
import co.com.sofka.PetProject.venta.values.Precio;
import co.com.sofka.PetProject.venta.values.Procedencia;
import co.com.sofka.PetProject.venta.values.ProductoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {
    private Procedencia procedencia;
    private Informacion informacion;
    private Precio precio;

    public Producto(ProductoId entityId,Procedencia procedencia,Informacion informacion,Precio precio) {
        super(entityId);
        this.procedencia = procedencia;
        this.informacion = informacion;
        this.precio = precio;
    }

    public void actualizarProcedencia(Procedencia procedencia){
        this.procedencia = Objects.requireNonNull(procedencia);
    }

    public void actualizarInformacion(Informacion informacion){
        this.informacion = Objects.requireNonNull(informacion);
    }

    public void cambiarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    public Procedencia procedencia() {
        return procedencia;
    }

    public Informacion informacion() {
        return informacion;
    }

    public Precio precio() {
        return precio;
    }
}
