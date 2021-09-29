package co.com.sofka.PetProject.cliente.commands;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.cliente.values.Email;
import co.com.sofka.PetProject.cliente.values.PersonaId;
import co.com.sofka.domain.generic.Command;

public class actualizarEmailPersona extends Command {
    private final ClienteId clienteId;
    private final PersonaId personaId;
    private final Email email;

    public actualizarEmailPersona(ClienteId clienteId, PersonaId personaId, Email email) {
        this.clienteId = clienteId;
        this.personaId = personaId;
        this.email = email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Email getEmail() {
        return email;
    }
}
