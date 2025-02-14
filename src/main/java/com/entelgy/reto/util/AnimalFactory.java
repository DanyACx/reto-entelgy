package com.entelgy.reto.util;

import org.springframework.stereotype.Component;

import com.entelgy.reto.model.Delfin;
import com.entelgy.reto.model.Loro;
import com.entelgy.reto.model.Perro;
import com.entelgy.reto.model.TipoAnimal;
import com.entelgy.reto.service.AnimalBase;

@Component
public class AnimalFactory {
	public AnimalBase crearAnimal(String nombre, TipoAnimal tipo, String onomatopeya) {
        switch (tipo) {
            case TERRESTRE:
                return new Perro(nombre, onomatopeya);
            case VOLADOR:
                return new Loro(nombre, onomatopeya);
            case ACUATICO:
                return new Delfin(nombre, onomatopeya);
            default:
                return new AnimalBase(nombre, onomatopeya, tipo) {};
        }
    }
}
