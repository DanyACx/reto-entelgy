package com.entelgy.reto.model;

import com.entelgy.reto.service.AnimalBase;

public class Loro extends AnimalBase {

	public Loro(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, TipoAnimal.VOLADOR);
    }
}
