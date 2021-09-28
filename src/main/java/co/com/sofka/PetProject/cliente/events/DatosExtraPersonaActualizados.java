package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.values.DatosExtras;
import co.com.sofka.PetProject.cliente.values.PersonaId;
import co.com.sofka.domain.generic.DomainEvent;

public class DatosExtraPersonaActualizados extends DomainEvent {
    private final PersonaId personaId;
    private final DatosExtras datosExtras;

    public DatosExtraPersonaActualizados(PersonaId personaId, DatosExtras datosExtras) {
        super("petproject.cliente.datosextrapersonaactualizados");
        this.personaId = personaId;
        this.datosExtras = datosExtras;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public DatosExtras getDatosExtras() {
        return datosExtras;
    }
}
