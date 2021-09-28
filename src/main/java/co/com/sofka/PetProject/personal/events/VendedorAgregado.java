package co.com.sofka.PetProject.personal.events;

import co.com.sofka.PetProject.personal.values.Cedula;
import co.com.sofka.PetProject.personal.values.DatosExtras;
import co.com.sofka.PetProject.personal.values.Nombre;
import co.com.sofka.PetProject.personal.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class VendedorAgregado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Nombre nombre;
    private final DatosExtras datosExtras;
    private final Cedula cedula;
    public VendedorAgregado(VendedorId vendedorId,Nombre nombre,DatosExtras datosExtras,Cedula cedula) {
        super("petproject.personal.vendedoragregado");
        this.vendedorId = vendedorId;
        this.nombre = nombre;
        this.datosExtras = datosExtras;
        this.cedula = cedula;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public DatosExtras getDatosExtras() {
        return datosExtras;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
