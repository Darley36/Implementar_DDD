package co.com.sofka.PetProject.personal.events;

import co.com.sofka.PetProject.personal.values.DatosExtras;
import co.com.sofka.PetProject.personal.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class DatosExtraVendedorActualizados extends DomainEvent {
    private final VendedorId vendedorId;
    private final DatosExtras datosExtras;

    public DatosExtraVendedorActualizados(VendedorId vendedorId, DatosExtras datosExtras) {
        super("petproject.personal.datosextravendedoractualizado");
        this.vendedorId = vendedorId;
        this.datosExtras = datosExtras;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public DatosExtras getDatosExtras() {
        return datosExtras;
    }
}
