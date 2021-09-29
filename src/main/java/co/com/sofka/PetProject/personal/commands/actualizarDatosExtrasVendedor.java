package co.com.sofka.PetProject.personal.commands;

import co.com.sofka.PetProject.personal.values.DatosExtras;
import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.PetProject.personal.values.VendedorId;
import co.com.sofka.domain.generic.Command;

public class actualizarDatosExtrasVendedor extends Command {
    private final PersonalId personalId;
    private final VendedorId vendedorId;
    private final DatosExtras datosExtras;

    public actualizarDatosExtrasVendedor(PersonalId personalId, VendedorId vendedorId, DatosExtras datosExtras) {
        this.personalId = personalId;
        this.vendedorId = vendedorId;
        this.datosExtras = datosExtras;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public DatosExtras getDatosExtras() {
        return datosExtras;
    }
}
