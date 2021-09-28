package co.com.sofka.PetProject.cliente.events;

import co.com.sofka.PetProject.cliente.values.TallerId;
import co.com.sofka.PetProject.cliente.values.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class UbicacionTallerActualizada extends DomainEvent {
    private final TallerId tallerId;
    private final Ubicacion ubicacion;
    public UbicacionTallerActualizada(TallerId tallerId, Ubicacion ubicacion) {
        super("petproject.cliente.ubicaciontalleractualizada");
        this.tallerId = tallerId;
        this.ubicacion = ubicacion;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
