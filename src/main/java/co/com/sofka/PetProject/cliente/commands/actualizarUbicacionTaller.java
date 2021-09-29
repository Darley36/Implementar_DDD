package co.com.sofka.PetProject.cliente.commands;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.cliente.values.TallerId;
import co.com.sofka.PetProject.cliente.values.Ubicacion;
import co.com.sofka.domain.generic.Command;

public class actualizarUbicacionTaller extends Command {
    private final ClienteId clienteId;
    private final TallerId tallerId;
    private final Ubicacion ubicacion;

    public actualizarUbicacionTaller(ClienteId clienteId, TallerId tallerId, Ubicacion ubicacion) {
        this.clienteId = clienteId;
        this.tallerId = tallerId;
        this.ubicacion = ubicacion;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
