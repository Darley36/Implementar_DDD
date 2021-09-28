package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.values.Nombre;
import co.com.sofka.PetProject.cliente.values.PersonaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombrePersonaCambiado extends DomainEvent {
    private final PersonaId personaId;
    private final Nombre nombre;

    public NombrePersonaCambiado(PersonaId personaId, Nombre nombre) {
        super("petproject.cliente.nombrepersonacambiado");
        this.personaId = personaId;
        this.nombre = nombre;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
