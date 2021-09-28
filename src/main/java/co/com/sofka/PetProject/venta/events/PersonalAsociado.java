package co.com.sofka.PetProject.venta.events;

import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.domain.generic.DomainEvent;

public class PersonalAsociado extends DomainEvent {
    private final PersonalId personalId;

    public PersonalAsociado(PersonalId personalId) {
        super("petproject.venta.personalasociado");
        this.personalId = personalId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
