package co.com.sofka.PetProject.personal.events;

import co.com.sofka.PetProject.personal.values.Cedula;
import co.com.sofka.PetProject.personal.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class CedulaVendedorCambiado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Cedula cedula;

    public CedulaVendedorCambiado(VendedorId vendedorId, Cedula cedula) {
        super("type");
        this.vendedorId = vendedorId;
        this.cedula = cedula;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
