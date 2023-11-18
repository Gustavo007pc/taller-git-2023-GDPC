package com.gp.demo.utils;


import java.util.List;

import com.gp.demo.model.Alumno;
import com.gp.demo.model.Persona;

public class CursoUtils {

    public static void invitarAlumnos(List<Persona> personas) {

        for (Persona elemento : personas) {
            System.out.println("Email: " + elemento.getEmail());
            if (elemento instanceof Alumno) {
                Alumno unAlumno = (Alumno) elemento;
                System.out.println("Nro. de Matrícula: " + unAlumno.getNumeroMatricula());
            } else {
                System.out.println("No es alumno.");
            }
        }
    }

}