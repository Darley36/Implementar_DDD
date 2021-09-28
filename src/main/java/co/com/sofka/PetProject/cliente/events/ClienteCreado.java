package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.values.FrecuenciaSemana;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {

    private final FrecuenciaSemana frecuenciaSemana;

    public ClienteCreado(FrecuenciaSemana frecuenciaSemana) {
        super("sofka.cliente.clientecreado");
        this.frecuenciaSemana = frecuenciaSemana;
    }

    public FrecuenciaSemana getFrecuenciaSemana(){
        return frecuenciaSemana;
    }
}
