package co.com.sofka.PetProject.personal;

import co.com.sofka.PetProject.personal.values.CargoId;
import co.com.sofka.PetProject.personal.values.Funcion;
import co.com.sofka.PetProject.personal.values.Horario;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cargo extends Entity<CargoId> {
    private Horario horario;
    private Funcion funcion;

    public Cargo(CargoId entityId,Horario horario,Funcion funcion) {
        super(entityId);
        this.horario = horario;
        this.funcion = funcion;
    }

    public void actualizarHorario(Horario horario){
        this.horario = Objects.requireNonNull(horario);
    }
    public void cambiarFuncion(Funcion funcion){
        this.funcion = Objects.requireNonNull(funcion);
    }

    public Horario horario() {
        return horario;
    }

    public Funcion funcion() {
        return funcion;
    }
}
