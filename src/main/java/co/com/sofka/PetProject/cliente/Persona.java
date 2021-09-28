package co.com.sofka.PetProject.cliente;

import co.com.sofka.PetProject.cliente.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Persona extends Entity<PersonaId> {
    private Nombre nombre;
    private DatosExtras datosExtras;
    private Email email;

    public Persona(PersonaId entityId,DatosExtras datosExtras,Email email) {
        super(entityId);
        this.datosExtras = datosExtras;
        this.email = email;
    }

    public void actualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public void cambiarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarDatosExtras(DatosExtras datosExtras){
        this.datosExtras = Objects.requireNonNull(datosExtras);
    }

    public Nombre nombre() {
        return nombre;
    }

    public DatosExtras datosExtras() {
        return datosExtras;
    }

    public Email email() {
        return email;
    }
}
