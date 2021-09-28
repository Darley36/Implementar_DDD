package co.com.sofka.PetProject.cliente;

import co.com.sofka.PetProject.cliente.values.Rut;
import co.com.sofka.PetProject.cliente.values.TallerId;
import co.com.sofka.PetProject.cliente.values.Ubicacion;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Taller extends Entity<TallerId> {

    private Rut rut;
    private Ubicacion ubicacion;

    public Taller(TallerId entityId, Rut rut, Ubicacion ubicacion) {
        super(entityId);
        this.rut = rut;
        this.ubicacion = ubicacion;
    }

    public void cambiarRut(Rut rut){
        this.rut = Objects.requireNonNull(rut);
    }

    public void actualizarUbicacion(Ubicacion ubicacion){
        this.ubicacion = Objects.requireNonNull(ubicacion);
    }

    public Rut rut(){
        return rut;
    }

    public Ubicacion ubicacion(){
        return ubicacion;
    }


}
