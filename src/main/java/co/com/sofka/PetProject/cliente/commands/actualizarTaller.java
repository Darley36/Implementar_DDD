package co.com.sofka.PetProject.cliente.commands;

import co.com.sofka.PetProject.cliente.values.*;
import co.com.sofka.domain.generic.Command;

public class actualizarTaller extends Command {
    private final ClienteId clienteId;
    private final TallerId entityId;
    private final Rut rut;
    private final Ubicacion ubicacion;

    public actualizarTaller(ClienteId clienteId, TallerId entityId, Rut rut, Ubicacion ubicacion) {
        this.clienteId = clienteId;
        this.entityId = entityId;
        this.rut = rut;
        this.ubicacion = ubicacion;
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

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
