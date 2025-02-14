package com.entelgy.reto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.entelgy.reto.model.TipoAnimal;
import com.entelgy.reto.util.AnimalFactory;

@Service
public class AnimalService {

	private final AnimalFactory animalFactory;

    public AnimalService(AnimalFactory animalFactory) {
        this.animalFactory = animalFactory;
    }

    public List<IAnimal> procesarAnimales(String[] entradas) {
        List<IAnimal> animales = new ArrayList<>();

        for (String entrada : entradas) {
            String[] partes = entrada.split("\\|");
            if (partes.length != 3) {
                System.err.println("Formato incorrecto: " + entrada);
                continue;
            }

            String nombre = partes[0];
            TipoAnimal tipo = TipoAnimal.valueOf(partes[1].toUpperCase());
            String onomatopeya = partes[2];

            animales.add(animalFactory.crearAnimal(nombre, tipo, onomatopeya));
        }
        return animales;
    }

    public void mostrarAnimalesAgrupados(List<IAnimal> animales) {
        Map<TipoAnimal, List<IAnimal>> agrupados = animales.stream()
                .collect(Collectors.groupingBy(IAnimal::getTipo));

        agrupados.forEach((tipo, lista) -> {
            System.out.println("\nAnimales de tipo: " + tipo);
            lista.forEach(IAnimal::hacerSonido);
        });
    }
}
