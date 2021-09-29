package co.com.sofka.PetProject.personal.commands;

import co.com.sofka.PetProject.personal.values.CargoId;
import co.com.sofka.PetProject.personal.values.Funcion;
import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.domain.generic.Command;

public class cambiarFuncionCargo extends Command {
    private final PersonalId personalId;
    private final CargoId cargoId;
    private final Funcion funcion;

    public cambiarFuncionCargo(PersonalId personalId, CargoId cargoId, Funcion funcion) {
        this.personalId = personalId;
        this.cargoId = cargoId;
        this.funcion = funcion;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public CargoId getCargoId() {
        return cargoId;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
