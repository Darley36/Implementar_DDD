package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.values.Email;
import co.com.sofka.PetProject.cliente.values.PersonaId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailPersonaActualizado extends DomainEvent {
    private final PersonaId personaId;
    private final Email email;
    public EmailPersonaActualizado(PersonaId personaId, Email email) {
        super("petproject.cliente.emailpersonaactualizado");
        this.personaId= personaId;
        this.email = email;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Email getEmail() {
        return email;
    }
}
