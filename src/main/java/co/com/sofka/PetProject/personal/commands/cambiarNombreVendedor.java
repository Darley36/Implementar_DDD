package co.com.sofka.PetProject.personal.commands;

import co.com.sofka.PetProject.personal.values.Nombre;
import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.PetProject.personal.values.VendedorId;
import co.com.sofka.domain.generic.Command;

public class cambiarNombreVendedor extends Command {
    private final PersonalId personalId;
    private final VendedorId vendedorId;
    private final Nombre nombre;

    public cambiarNombreVendedor(PersonalId personalId, VendedorId vendedorId, Nombre nombre) {
        this.personalId = personalId;
        this.vendedorId = vendedorId;
        this.nombre = nombre;
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
}
