package co.com.sofka.PetProject.personal.events;

import co.com.sofka.PetProject.personal.values.CargoId;
import co.com.sofka.PetProject.personal.values.Funcion;
import co.com.sofka.PetProject.personal.values.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class CargoActualizado extends DomainEvent {
    private final CargoId cargoId;
    private final Horario horario;
    private final Funcion funcion;
    public CargoActualizado(CargoId cargoId, Horario horario, Funcion funcion) {
        super("petproject.personal.cargoactualizado");
        this.cargoId = cargoId;
        this.horario = horario;
        this.funcion = funcion;
    }

    public CargoId getCargoId() {
        return cargoId;
    }

    public Horario getHorario() {
        return horario;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
