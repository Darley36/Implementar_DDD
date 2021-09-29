package co.com.sofka.PetProject.personal.commands;

import co.com.sofka.PetProject.personal.values.*;
import co.com.sofka.domain.generic.Command;

public class actualizarVendedor extends Command {
    private final PersonalId personalId;
    private final VendedorId vendedorId;
    private final Nombre nombre;
    private final DatosExtras datosExtras;
    private final Cedula cedula;

    public actualizarVendedor(PersonalId personalId, VendedorId vendedorId, Nombre nombre, DatosExtras datosExtras, Cedula cedula) {
        this.personalId = personalId;
        this.vendedorId = vendedorId;
        this.nombre = nombre;
        this.datosExtras = datosExtras;
        this.cedula = cedula;
    }

    public PersonalId getPersonalId() {
        return personalId;
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
