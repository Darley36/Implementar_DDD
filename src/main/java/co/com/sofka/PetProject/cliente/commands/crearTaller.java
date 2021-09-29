package co.com.sofka.PetProject.cliente.commands;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.cliente.values.Rut;
import co.com.sofka.PetProject.cliente.values.TallerId;
import co.com.sofka.PetProject.cliente.values.Ubicacion;
import co.com.sofka.domain.generic.Command;

public class crearTaller extends Command {
    private final ClienteId clienteId;
    private final TallerId entityId;
    private final Rut rut;
    private final Ubicacion ubicacion;

    public crearTaller(ClienteId clienteId, TallerId entityId, Rut rut, Ubicacion ubicacion) {
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
