package com.entelgy.reto.service;

import com.entelgy.reto.model.TipoAnimal;

public interface IAnimal {

	void hacerSonido();
    String getNombre();
    TipoAnimal getTipo();
}
