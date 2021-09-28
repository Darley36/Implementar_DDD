package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.values.Rut;
import co.com.sofka.PetProject.cliente.values.TallerId;
import co.com.sofka.domain.generic.DomainEvent;

public class RutTallerCambiado extends DomainEvent {
    private final TallerId entityId;
    private final Rut rut;

    public RutTallerCambiado(TallerId entityId, Rut rut) {
        super("petproject.cliente.ruttallercambiado");
        this.entityId = entityId;
        this.rut = rut;
    }

    public TallerId getEntityId() {
        return entityId;
    }

    public Rut getRut() {
        return rut;
    }
}
