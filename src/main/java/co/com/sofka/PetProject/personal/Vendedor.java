package co.com.sofka.PetProject.personal;

import co.com.sofka.PetProject.personal.values.Cedula;
import co.com.sofka.PetProject.personal.values.DatosExtras;
import co.com.sofka.PetProject.personal.values.Nombre;
import co.com.sofka.PetProject.personal.values.VendedorId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Vendedor extends Entity<VendedorId> {
    private Nombre nombre;
    private DatosExtras datosExtras;
    private Cedula cedula;

    public Vendedor(VendedorId entityId,Nombre nombre,DatosExtras datosExtras,Cedula cedula) {
        super(entityId);
        this.nombre = nombre;
        this.datosExtras = datosExtras;
        this.cedula = cedula;
    }

    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarDatosExtras(DatosExtras datosExtras){
        this.datosExtras = Objects.requireNonNull(datosExtras);
    }

    public void cambiarCedula(Cedula cedula){
        this.cedula = cedula;
    }

    public Nombre nombre() {
        return nombre;
    }

    public DatosExtras datosExtras() {
        return datosExtras;
    }

    public Cedula cedula() {
        return cedula;
    }
}
