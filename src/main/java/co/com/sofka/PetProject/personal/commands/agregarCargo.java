package co.com.sofka.PetProject.personal.commands;

import co.com.sofka.PetProject.personal.values.CargoId;
import co.com.sofka.PetProject.personal.values.Funcion;
import co.com.sofka.PetProject.personal.values.Horario;
import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.domain.generic.Command;

public class agregarCargo extends Command {
    private final PersonalId personalId;
    private final CargoId entityId;
    private final Horario horario;
    private final Funcion funcion;

    public agregarCargo(PersonalId personalId, CargoId entityId, Horario horario, Funcion funcion) {
        this.personalId = personalId;
        this.entityId = entityId;
        this.horario = horario;
        this.funcion = funcion;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public CargoId getEntityId() {
        return entityId;
    }

    public Horario getHorario() {
        return horario;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
