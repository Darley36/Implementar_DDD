package co.com.sofka.PetProject.cliente;

import co.com.sofka.PetProject.cliente.values.ClienteId;
import co.com.sofka.PetProject.cliente.values.FrecuenciaSemana;
import co.com.sofka.domain.generic.AggregateEvent;

public class Cliente extends AggregateEvent<ClienteId> {
    public Cliente(ClienteId entityId, FrecuenciaSemana frecuenciaSemana) {
        super(entityId);
    }
}
