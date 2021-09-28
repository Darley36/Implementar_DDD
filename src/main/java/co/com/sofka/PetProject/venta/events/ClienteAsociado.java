package co.com.sofka.PetProject.venta.events;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAsociado extends DomainEvent {
    private final ClienteId clienteId;
    public ClienteAsociado(ClienteId clienteId) {
        super("petproject.venta.clienteasociado");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
