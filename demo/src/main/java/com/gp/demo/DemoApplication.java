package com.gp.demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.gp.demo.model.Alumno;
import com.gp.demo.model.Persona;
import com.gp.demo.tools.Estante;
import com.gp.demo.tools.Libro;
import com.gp.demo.utils.CursoUtils;
import com.gp.demo.utils.LibrosUtil;




@SpringBootApplication
@ComponentScan(basePackages = {"com.gp.demo"})
@EnableJpaRepositories(basePackages = {"com.gp.demo"})
@EntityScan(basePackages = {"com.gp.demo"})

public class DemoApplication {

	public static void main(String[] args) {
		leerArchivo();
		
		publicidadParaAlumnos();
		SpringApplication.run(DemoApplication.class, args);
	}

	private static void leerArchivo() {
		String pathname = "C:\\Users\\fabian\\Desktop\\testLP3.txt";
		File archivo = new File(pathname);
		try {
			byte[] buffer = FileUtils.readFileToByteArray(archivo);
			System.out.println("Leido: " + new String(buffer));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	  public static void ordenarEstante() {
	        Estante desordenado = new Estante();
	        Libro libro1 = new Libro("Redes de computadoras");
	        desordenado.add(libro1);
	        Libro libro2 = new Libro("Geekonomics");
	        desordenado.add(libro2);
	        Libro libro3 = new Libro("Hit refresh");
	        desordenado.add(libro3);

	        System.out.println("Desordenado:" + desordenado);
	        Estante ordenado = LibrosUtil.ordenar(desordenado);
	        System.out.println("Desordenado:" + desordenado);

	    }
	  
	    public static void publicidadParaAlumnos() {
	        List<Persona> personas = new ArrayList<>();
	        Alumno alumno = new Alumno(964343, "ale@algo.com");
	     
	    //    alumno.setNumeroMatricula("37122");
	        
	        Persona persona = new Persona();
	        persona.setTipoDoc("CEDULA DE IDENTIDAD");
	        persona.setNumDoc(4454479);
	        persona.setNombre("GUSTAVO DANEL");
	        persona.setApellido("PEREZ");
	        persona.setEmail("gp@hotmail.com");

	        personas.add(alumno);
	        personas.add(persona);
	        
	        CursoUtils.invitarAlumnos(personas);
	    }
}
