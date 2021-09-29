package co.com.sofka.PetProject.cliente;

import co.com.sofka.PetProject.cliente.events.*;
import co.com.sofka.PetProject.venta.events.InformacionProductoActualizado;
import co.com.sofka.domain.generic.EventChange;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {

        apply((ClienteCreado event) ->{
            cliente.frecuenciaSemana = event.getFrecuenciaSemana();
            //cliente.persona = new Persona();
        });

        apply((DatosExtraPersonaActualizados event) -> {
            cliente.actualizarDatosExtrasPersona(event.getPersonaId(), event.getDatosExtras());
        });

        apply((EmailPersonaActualizado event) -> {
            cliente.actualizarEmailPersona(event.getPersonaId(), event.getEmail());
        });

        apply((NombrePersonaCambiado event) -> {
            cliente.cambiarNombrePersona(event.getPersonaId(), event.getNombre());
        });

        apply((PersonaCreada event) -> {
            cliente.crearPersona(
                    event.getPersonaId(),
                    event.getNombre(),
                    event.getDatosExtras(),
                    event.getEmail()
            );
        });

        apply((PersonaActualizada event) -> {
            cliente.actualizarPersona(
                    event.getPersonaId(),
                    event.getNombre(),
                    event.getDatosExtras(),
                    event.getEmail()
            );
        });

        apply((TallerCreado event) -> {
            cliente.crearTaller(
                    event.getEntityId(),
                    event.getRut(),
                    event.getUbicacion()
            );
        });

        apply((TallerActualizado event) -> {
            cliente.actualizarTaller(
                    event.getEntityId(),
                    event.getRut(),
                    event.getUbicacion()
            );
        });

        apply((UbicacionTallerActualizada event) -> {
            cliente.actualizarUbicacionTaller(event.getTallerId(), event.getUbicacion());
        });

    }
}
