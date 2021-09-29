package co.com.sofka.PetProject.personal.commands;

import co.com.sofka.PetProject.personal.values.CargoId;
import co.com.sofka.PetProject.personal.values.Funcion;
import co.com.sofka.PetProject.personal.values.Horario;
import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.domain.generic.Command;

public class actualizarCargo extends Command {
    private final PersonalId personalId;
    private final CargoId cargoId;
    private final Horario horario;
    private final Funcion funcion;

    public actualizarCargo(PersonalId personalId, CargoId cargoId, Horario horario, Funcion funcion) {
        this.personalId = personalId;
        this.cargoId = cargoId;
        this.horario = horario;
        this.funcion = funcion;
    }

    public PersonalId getPersonalId() {
        return personalId;
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
