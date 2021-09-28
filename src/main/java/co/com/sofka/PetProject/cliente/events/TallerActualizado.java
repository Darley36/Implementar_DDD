package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.Taller;
import co.com.sofka.domain.generic.DomainEvent;

public class TallerActualizado extends DomainEvent {
    private final Taller taller;
    public TallerActualizado(Taller taller) {
        super("petproject.cliente.talleractualizado");
        this.taller = taller;
    }

    public Taller getTaller() {
        return taller;
    }
}
