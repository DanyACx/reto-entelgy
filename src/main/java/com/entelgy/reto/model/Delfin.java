package com.entelgy.reto.model;

import com.entelgy.reto.service.AnimalBase;

public class Delfin extends AnimalBase  {

	public Delfin(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, TipoAnimal.ACUATICO);
    }
}
