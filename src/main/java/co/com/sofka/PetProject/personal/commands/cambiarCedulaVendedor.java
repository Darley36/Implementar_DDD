package co.com.sofka.PetProject.personal.commands;

import co.com.sofka.PetProject.personal.values.Cedula;
import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.PetProject.personal.values.VendedorId;
import co.com.sofka.domain.generic.Command;

public class cambiarCedulaVendedor extends Command {
    private final PersonalId personalId;
    private final VendedorId vendedorId;
    private final Cedula cedula;

    public cambiarCedulaVendedor(PersonalId personalId, VendedorId vendedorId, Cedula cedula) {
        this.personalId = personalId;
        this.vendedorId = vendedorId;
        this.cedula = cedula;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
