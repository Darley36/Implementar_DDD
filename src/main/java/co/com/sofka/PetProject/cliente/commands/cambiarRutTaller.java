package co.com.sofka.PetProject.cliente.commands;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.cliente.values.Rut;
import co.com.sofka.PetProject.cliente.values.TallerId;
import co.com.sofka.domain.generic.Command;

public class cambiarRutTaller extends Command {
    private final ClienteId clienteId;
    private final TallerId entityId;
    private final Rut rut;

    public cambiarRutTaller(ClienteId clienteId, TallerId entityId, Rut rut) {
        this.clienteId = clienteId;
        this.entityId = entityId;
        this.rut = rut;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public TallerId getEntityId() {
        return entityId;
    }

    public Rut getRut() {
        return rut;
    }
}
