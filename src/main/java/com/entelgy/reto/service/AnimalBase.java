package com.entelgy.reto.service;

import com.entelgy.reto.model.TipoAnimal;

public abstract class AnimalBase implements IAnimal {

	private final String nombre;
	private final String onomatopeya;
	private final TipoAnimal tipo;

	public AnimalBase(String nombre, String onomatopeya, TipoAnimal tipo) {
		this.nombre = nombre;
		this.onomatopeya = onomatopeya;
		this.tipo = tipo;
	}

	@Override
	public void hacerSonido() {
		System.out.println(nombre + " hace: " + onomatopeya);
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public TipoAnimal getTipo() {
		return tipo;
	}
}
