package co.com.sofka.PetProject.personal.events;

import co.com.sofka.PetProject.personal.values.Nombre;
import co.com.sofka.PetProject.personal.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreVendedorCambiado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Nombre nombre;

    public NombreVendedorCambiado(VendedorId vendedorId, Nombre nombre) {
        super("type");
        this.vendedorId = vendedorId;
        this.nombre = nombre;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
