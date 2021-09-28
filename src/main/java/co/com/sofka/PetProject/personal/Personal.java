package co.com.sofka.PetProject.personal;

import co.com.sofka.PetProject.personal.events.*;
import co.com.sofka.PetProject.personal.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Personal extends AggregateEvent<PersonalId> {
    protected Cargo cargo;
    protected Vendedor vendedor;

    public Personal(PersonalId entityId) {
        super(entityId);
        appendChange(new PersonalCreado()).apply();
    }

    public void agregarVendedor(VendedorId entityId, Nombre nombre, DatosExtras datosExtras, Cedula cedula){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(datosExtras);
        Objects.requireNonNull(cedula);
        appendChange(new VendedorAgregado(entityId,nombre,datosExtras,cedula)).apply();
    }

    public void actualizarVendedor(VendedorId vendedorId, Nombre nombre, DatosExtras datosExtras, Cedula cedula){
        Objects.requireNonNull(vendedorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(datosExtras);
        Objects.requireNonNull(cedula);
        appendChange(new VendedorActualizado(vendedorId,nombre,datosExtras,cedula)).apply();
    }

    public void agregarCargo(CargoId entityId,Horario horario,Funcion funcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(horario);
        Objects.requireNonNull(funcion);
        appendChange(new CargoAgregado(entityId,horario,funcion)).apply();
    }

    public void actualizarCargo(CargoId cargoId,Horario horario,Funcion funcion){
        Objects.requireNonNull(cargoId);
        Objects.requireNonNull(horario);
        Objects.requireNonNull(funcion);
        appendChange(new CargoActualizado(cargoId,horario,funcion)).apply();
    }

    public void actualizarHorarioCargo(CargoId cargoId, Horario horario){
        Objects.requireNonNull(cargoId);
        Objects.requireNonNull(horario);
        appendChange(new HorarioCargoActualizado(cargoId,horario)).apply();
    }

    public void cambiarFuncionCargo(CargoId cargoId,Funcion funcion){
        Objects.requireNonNull(cargoId);
        Objects.requireNonNull(funcion);
        appendChange(new FuncionCargoCambiado(cargoId,funcion)).apply();
    }

    public void cambiarNombreVendedor(VendedorId vendedorId,Nombre nombre){
        Objects.requireNonNull(vendedorId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreVendedorCambiado(vendedorId, nombre)).apply();
    }

    public void actualizarDatosExtrasVendedor(VendedorId vendedorId,DatosExtras datosExtras){
        Objects.requireNonNull(vendedorId);
        Objects.requireNonNull(datosExtras);
        appendChange(new DatosExtraVendedorActualizados(vendedorId,datosExtras)).apply();
    }

    public void cambiarCedulaVendedor(VendedorId vendedorId,Cedula cedula){
        Objects.requireNonNull(vendedorId);
        Objects.requireNonNull(cedula);
        appendChange(new CedulaVendedorCambiado(vendedorId,cedula)).apply();
    }
}
