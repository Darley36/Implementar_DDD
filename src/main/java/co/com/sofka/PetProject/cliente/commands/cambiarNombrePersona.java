package co.com.sofka.PetProject.cliente.commands;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.cliente.values.Nombre;
import co.com.sofka.PetProject.cliente.values.PersonaId;
import co.com.sofka.domain.generic.Command;

public class cambiarNombrePersona extends Command {
    private final ClienteId clienteId;
    private final PersonaId personaId;
    private final Nombre nombre;

    public cambiarNombrePersona(ClienteId clienteId, PersonaId personaId, Nombre nombre) {
        this.clienteId = clienteId;
        this.personaId = personaId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
