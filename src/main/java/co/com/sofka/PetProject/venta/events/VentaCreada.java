package co.com.sofka.PetProject.venta.events;

import co.com.sofka.domain.generic.DomainEvent;

public class VentaCreada extends DomainEvent {
    public VentaCreada() {
        super("petproject.venta.ventacreada");
    }
}
