package co.com.sofka.PetProject.personal.commands;

import co.com.sofka.PetProject.personal.values.CargoId;
import co.com.sofka.PetProject.personal.values.Horario;
import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.domain.generic.Command;

public class actualizarHorarioCargo extends Command {
    private final PersonalId personalId;
    private final CargoId cargoId;
    private final Horario horario;

    public actualizarHorarioCargo(PersonalId personalId, CargoId cargoId, Horario horario) {
        this.personalId = personalId;
        this.cargoId = cargoId;
        this.horario = horario;
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
}
