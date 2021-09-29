package co.com.sofka.PetProject.cliente;

import co.com.sofka.PetProject.cliente.events.ClienteCreado;
import co.com.sofka.domain.generic.EventChange;

public class PersonaChange extends EventChange {
    public PersonaChange(Cliente cliente) {
        apply((ClienteCreado event) ->{
            cliente.frecuenciaSemana = event.getFrecuenciaSemana();
            //cliente.persona = new Persona();
        });

    }
}
