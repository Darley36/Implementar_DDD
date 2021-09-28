package co.com.sofka.PetProject.personal.events;

import co.com.sofka.domain.generic.DomainEvent;

public class PersonalCreado extends DomainEvent {
    public PersonalCreado() {
        super("petproject.personal.personalcreado");
    }
}
