package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.values.Rut;
import co.com.sofka.PetProject.cliente.values.TallerId;
import co.com.sofka.PetProject.cliente.values.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class TallerCreado extends DomainEvent {
    private final TallerId entityId;
    private final Rut rut;
    private final Ubicacion ubicacion;

    public TallerCreado(TallerId entityId, Rut rut, Ubicacion ubicacion) {
        super("petproject.cliente.tallercreada");
        this.entityId = entityId;
        this.rut = rut;
        this.ubicacion = ubicacion;
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
