package co.com.sofka.PetProject.venta.commands;

import co.com.sofka.PetProject.personal.values.PersonalId;
import co.com.sofka.PetProject.venta.values.VentaId;
import co.com.sofka.domain.generic.Command;

public class asociarPersonal extends Command {
    private final VentaId ventaId;
    private final PersonalId personalId;

    public asociarPersonal(VentaId ventaId, PersonalId personalId) {
        this.ventaId = ventaId;
        this.personalId = personalId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public PersonalId getPersonalId() {
        return personalId;
    }
}
