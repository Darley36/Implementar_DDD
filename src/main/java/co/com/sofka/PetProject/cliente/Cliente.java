package co.com.sofka.PetProject.cliente;

import co.com.sofka.PetProject.cliente.events.ClienteCreado;
import co.com.sofka.PetProject.cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Cliente extends AggregateEvent<ClienteId> {
    protected FrecuenciaSemana frecuenciaSemana;
    protected Persona persona;
    protected Taller taller;

    public Cliente(ClienteId entityId, FrecuenciaSemana frecuenciaSemana) {
        super(entityId);
        appendChange(new ClienteCreado(frecuenciaSemana)).apply();
    }

    public void crearTaller(TallerId entityId, Rut rut, Ubicacion ubicacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(rut);
        Objects.requireNonNull(ubicacion);
        appendChange(new TallerCreado(entityId,rut,ubicacion)).apply();
    }

    public void actualizarTaller(){

    }

    public void cambiarRutTaller(TallerId entityId, Rut rut){
        appendChange(new RutTallerCambiado(entityId,rut)).apply();
    }
}
