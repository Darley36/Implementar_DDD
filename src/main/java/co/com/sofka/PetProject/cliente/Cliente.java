package co.com.sofka.PetProject.cliente;

import co.com.sofka.PetProject.cliente.events.*;
import co.com.sofka.PetProject.cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Cliente extends AggregateEvent<ClienteId> {
    protected FrecuenciaSemana frecuenciaSemana;
    protected Persona persona;
    protected Taller taller;

    public Cliente(ClienteId entityId, FrecuenciaSemana frecuenciaSemana) {
        super(entityId);
        appendChange(new ClienteCreado(frecuenciaSemana)).apply();
    }

    private Cliente(ClienteId clienteId){
        super(clienteId);
        subscribe(new ClienteChange(this));
    }

    public void crearPersona(PersonaId personaId, Nombre nombre,DatosExtras datosExtras,Email email){
        Objects.requireNonNull(personaId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(datosExtras);
        Objects.requireNonNull(email);
        appendChange(new PersonaCreada(personaId,nombre,datosExtras,email)).apply();
    }

    public void actualizarPersona(PersonaId personaId, Nombre nombre,DatosExtras datosExtras,Email email){
        Objects.requireNonNull(personaId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(datosExtras);
        Objects.requireNonNull(email);
        appendChange(new PersonaActualizada(personaId,nombre,datosExtras,email)).apply();
    }

    public void crearTaller(TallerId entityId, Rut rut, Ubicacion ubicacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(rut);
        Objects.requireNonNull(ubicacion);
        appendChange(new TallerCreado(entityId,rut,ubicacion)).apply();
    }

    public void actualizarTaller(TallerId entityId, Rut rut, Ubicacion ubicacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(rut);
        Objects.requireNonNull(ubicacion);
        appendChange(new TallerActualizado(entityId,rut,ubicacion)).apply();
    }

    public void actualizarEmailPersona(PersonaId personaId, Email email){
        Objects.requireNonNull(personaId);
        Objects.requireNonNull(email);
        appendChange(new EmailPersonaActualizado(personaId,email)).apply();
    }

    public void cambiarNombrePersona(PersonaId personaId, Nombre nombre){
        Objects.requireNonNull(personaId);
        Objects.requireNonNull(nombre);
        appendChange(new NombrePersonaCambiado(personaId,nombre)).apply();
    }

    public void actualizarDatosExtrasPersona(PersonaId personaId, DatosExtras datosExtras){
        Objects.requireNonNull(personaId);
        Objects.requireNonNull(datosExtras);
        appendChange(new DatosExtraPersonaActualizados(personaId,datosExtras)).apply();
    }

    public void cambiarRutTaller(TallerId entityId, Rut rut){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(rut);
        appendChange(new RutTallerCambiado(entityId,rut)).apply();
    }

    public void actualizarUbicacionTaller(TallerId tallerId, Ubicacion ubicacion){
        Objects.requireNonNull(tallerId);
        Objects.requireNonNull(ubicacion);
        appendChange(new UbicacionTallerActualizada(tallerId,ubicacion)).apply();
    }
}
