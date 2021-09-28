package co.com.sofka.PetProject.personal.events;

import co.com.sofka.PetProject.personal.values.CargoId;
import co.com.sofka.PetProject.personal.values.Funcion;
import co.com.sofka.domain.generic.DomainEvent;

public class FuncionCargoCambiado extends DomainEvent {
    private final CargoId cargoId;
    private final Funcion funcion;

    public FuncionCargoCambiado(CargoId cargoId, Funcion funcion) {
        super("type");
        this.cargoId = cargoId;
        this.funcion = funcion;
    }

    public CargoId getCargoId() {
        return cargoId;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
