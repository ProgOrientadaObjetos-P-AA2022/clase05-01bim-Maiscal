/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
    /*
        1. Crear una persona del barrio del Valle de la ciudad de Loja   
        2. Crear una persona del barrio central de la ciudad de Cuenca
        3. Crear una personas del barrio centenario del la ciudad Guayaquil
    */
    
        Ciudad c1 = new Ciudad("Loja");
        Ciudad c2 = new Ciudad("Cuenca");
        Ciudad c3 = new Ciudad("Guayaquil");
        
        Barrio b1 = new Barrio("Valle", c1);
        Barrio b2 = new Barrio("Central", c2);
        Barrio b3 = new Barrio("Centenario", c3);
        
        Persona p1 = new Persona("Mario Calva", "110125485", b1);
        Persona p2 = new Persona("Luis Sanchez", "110808465", b2);
        Persona p3 = new Persona("Erika Loaiza", "11058791285", b3);
    
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s con dni (%s) es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                p1.obtenerNombre(),
                p1.obtenerCedula(),
                p1.obtenerBarrio().obtenerNombre(),
                p1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        p1.establecerBarrio(b2);
        
        System.out.printf("El barrio de la persona %s con dni (%s)  es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                p2.obtenerNombre(),
                p2.obtenerCedula(),
                p2.obtenerBarrio().obtenerNombre(),
                p2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        
        b2.establecerCiudad(c2);
        System.out.printf("El barrio de la persona %s con dni (%s)  es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                p3.obtenerNombre(),
                p3.obtenerCedula(),
                p3.obtenerBarrio().obtenerNombre(),
                p3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
    }
}
