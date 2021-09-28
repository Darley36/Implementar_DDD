package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.Persona;
import co.com.sofka.domain.generic.DomainEvent;

public class PersonaActualizada extends DomainEvent {
    private final Persona persona;

    public PersonaActualizada(Persona persona) {
        super("petproject.cliente.personaactualizada");
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }
}
