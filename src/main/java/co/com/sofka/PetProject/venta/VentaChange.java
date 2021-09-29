package co.com.sofka.PetProject.venta;

import co.com.sofka.PetProject.venta.events.ClienteAsociado;
import co.com.sofka.PetProject.venta.events.InformacionProductoActualizado;
import co.com.sofka.PetProject.venta.events.VentaCreada;
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

        apply((InformacionProductoActualizado event) -> {
            var producto = venta.getProductoById(event.getProductoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la informacion del producto"));
            producto.actualizarInformacion(event.getInformacion());
        });
    }
}
