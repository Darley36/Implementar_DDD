package co.com.sofka.PetProject.personal.events;

import co.com.sofka.PetProject.personal.values.CargoId;
import co.com.sofka.PetProject.personal.values.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioCargoActualizado extends DomainEvent {
    private final CargoId cargoId;
    private final Horario horario;

    public HorarioCargoActualizado(CargoId cargoId, Horario horario) {
        super("petproject.personal.horariocargoactualizado");
        this.cargoId = cargoId;
        this.horario = horario;
    }

    public CargoId getCargoId() {
        return cargoId;
    }

    public Horario getHorario() {
        return horario;
    }
}
