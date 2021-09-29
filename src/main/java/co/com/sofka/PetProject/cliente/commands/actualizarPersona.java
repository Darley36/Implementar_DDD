package co.com.sofka.PetProject.cliente.commands;

import co.com.sofka.PetProject.cliente.values.*;
import co.com.sofka.domain.generic.Command;

public class actualizarPersona extends Command {
    private final ClienteId clienteId;
    private final PersonaId personaId;
    private final Nombre nombre;
    private final DatosExtras datosExtras;
    private final Email email;

    public actualizarPersona(ClienteId clienteId, PersonaId personaId, Nombre nombre, DatosExtras datosExtras, Email email) {
        this.clienteId = clienteId;
        this.personaId = personaId;
        this.nombre = nombre;
        this.datosExtras = datosExtras;
        this.email = email;
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

    public DatosExtras getDatosExtras() {
        return datosExtras;
    }

    public Email getEmail() {
        return email;
    }
}
