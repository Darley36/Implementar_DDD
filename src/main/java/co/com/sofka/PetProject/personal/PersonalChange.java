package co.com.sofka.PetProject.personal;

import co.com.sofka.PetProject.cliente.events.ClienteCreado;
import co.com.sofka.PetProject.cliente.events.DatosExtraPersonaActualizados;
import co.com.sofka.PetProject.personal.events.*;
import co.com.sofka.domain.generic.EventChange;

public class PersonalChange extends EventChange {
    public PersonalChange(Personal personal) {

        apply((PersonalCreado event) ->{

        });

        apply((CargoAgregado event) ->{
            personal.agregarCargo(event.getCargoId(),
                    event.getHorario(),
                    event.getFuncion());
        });

        apply((CargoActualizado event) ->{
            personal.actualizarCargo(event.getCargoId(),
                    event.getHorario(),
                    event.getFuncion());
        });

        apply((CedulaVendedorCambiado event) ->{
            personal.cambiarCedulaVendedor(event.getVendedorId(), event.getCedula());
        });

        apply((DatosExtraVendedorActualizados event) ->{
            personal.actualizarDatosExtrasVendedor(event.getVendedorId(), event.getDatosExtras());
        });

        apply((FuncionCargoCambiado event) ->{
            personal.cambiarFuncionCargo(event.getCargoId(), event.getFuncion());
        });

        apply((HorarioCargoActualizado event) ->{
            personal.actualizarHorarioCargo(event.getCargoId(), event.getHorario());
        });

        apply((NombreVendedorCambiado event) ->{
            personal.cambiarNombreVendedor(event.getVendedorId(), event.getNombre());
        });

        apply((VendedorAgregado event) ->{
            personal.agregarVendedor(event.getVendedorId(),
                    event.getNombre(),
                    event.getDatosExtras(),
                    event.getCedula());
        });

        apply((VendedorActualizado event) ->{
            personal.actualizarVendedor(event.getVendedorId(),
                    event.getNombre(),
                    event.getDatosExtras(),
                    event.getCedula());
        });

    }
}
