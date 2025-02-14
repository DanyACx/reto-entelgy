package com.entelgy.reto;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entelgy.reto.config.AppConfig;
import com.entelgy.reto.service.AnimalService;
import com.entelgy.reto.service.IAnimal;

public class RetoApplication   {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AnimalService animalService = context.getBean("animalService", AnimalService.class);

		
		 if (args.length == 0) {
	            System.out.println("Por favor, ingresa los datos en formato: nombre|tipo|onomatopeya");
	            context.close();
	            return;
	        }

	        List<IAnimal> animales = animalService.procesarAnimales(args);
	        animalService.mostrarAnimalesAgrupados(animales);
	        
	        context.close();
	}

}
