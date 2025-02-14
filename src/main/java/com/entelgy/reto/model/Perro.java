package com.entelgy.reto.model;

import com.entelgy.reto.service.AnimalBase;

public class Perro extends AnimalBase {

	public Perro(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, TipoAnimal.TERRESTRE);
    }
}
