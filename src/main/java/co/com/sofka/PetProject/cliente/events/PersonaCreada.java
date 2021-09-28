package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class PersonaCreada extends DomainEvent {
    private final PersonaId personaId;
    private final Nombre nombre;
    private final DatosExtras datosExtras;
    private final Email email;

    public PersonaCreada(PersonaId personaId,Nombre nombre,DatosExtras datosExtras,Email email) {
        super("petproject.cliente.personacreada");
        this.personaId = personaId;
        this.nombre = nombre;
        this.datosExtras =datosExtras;
        this.email = email;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public DatosExtras getDatosExtras() {
        return datosExtras;
    }

    public Email getEmail() {
        return email;
    }
}
