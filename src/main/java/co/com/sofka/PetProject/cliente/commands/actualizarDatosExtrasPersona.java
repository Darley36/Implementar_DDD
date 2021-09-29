package co.com.sofka.PetProject.cliente.commands;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.cliente.values.DatosExtras;
import co.com.sofka.PetProject.cliente.values.PersonaId;
import co.com.sofka.domain.generic.Command;

public class actualizarDatosExtrasPersona extends Command {
    private final ClienteId clienteId;
    private final PersonaId personaId;
    private final DatosExtras datosExtras;

    public ClienteId getClienteId() {
        return clienteId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public DatosExtras getDatosExtras() {
        return datosExtras;
    }

    public actualizarDatosExtrasPersona(ClienteId clienteId, PersonaId personaId, DatosExtras datosExtras) {
        this.clienteId = clienteId;
        this.personaId = personaId;
        this.datosExtras = datosExtras;
    }
}
