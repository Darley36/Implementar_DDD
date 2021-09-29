package co.com.sofka.PetProject.venta.commands;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;

public class asociarCliente extends Command {
    private final VentaId ventaId;
    private final ClienteId clienteId;

    public asociarCliente(VentaId ventaId, ClienteId clienteId) {
        this.ventaId = ventaId;
        this.clienteId = clienteId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
