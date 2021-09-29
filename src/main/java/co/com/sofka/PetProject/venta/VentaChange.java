package co.com.sofka.PetProject.venta;

import co.com.sofka.PetProject.venta.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class VentaChange extends EventChange {
    public VentaChange(Venta venta) {

        apply((VentaCreada event) -> {
            venta.productos = new HashSet<>();
        });

        apply((ClienteAsociado event) -> {
            venta.clienteId = event.getClienteId();
        });

        apply((PersonalAsociado event) -> {
            venta.personalId = event.getPersonalId();
        });

        apply((InformacionProductoActualizado event) -> {
            var producto = venta.getProductoById(event.getProductoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la informacion del producto"));
            producto.actualizarInformacion(event.getInformacion());
        });

        apply((PrecioProductoCambiado event) -> {
            var producto = venta.getProductoById(event.getProductoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la informacion del producto"));
            producto.cambiarPrecio(event.getPrecio());
        });

        apply((ProcedenciaProductoActualizado event) -> {
            var producto = venta.getProductoById(event.getProductoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la informacion del producto"));
            producto.actualizarProcedencia(event.getProcedencia());
        });

        apply((ProductoAnadido event) -> {
            venta.productos.add(new Producto(
                    event.getProductoId(),
                    event.getProcedencia(),
                    event.getInformacion(),
                    event.getPrecio()
            ));
        });

        apply((ProductoActualizado event) -> {
            venta.actualizarProducto(event.getProductoId(),
                    event.getProcedencia(),
                    event.getInformacion(),
                    event.getPrecio());
        });

        apply((TotalCalculado event) -> {
            venta.calcularTotal(35, event.getPrecio(), event.getProducto());
        });


    }
}
