/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.Scanner;

/**
 *
 * @author noese
 */
public class Persona {
    private String nombre;
    private int edad;
    private String apellido;
    private static Persona laUnica;

    public Persona() {
    }

    public Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre : ");
        nombre=sc.next();
        System.out.println("Introduce apellido: ");
        apellido=sc.next();
        System.out.println("Introduce edad : ");
        edad=sc.nextInt();
    }
    
    public static Persona getInstance(String nombre, int edad, String apellido){
        if(laUnica==null)
                laUnica=new Persona(nombre,edad,apellido);
        return laUnica;
    }
    public static Persona GetInstance(){
        if(laUnica==null)
                laUnica=new Persona();
        return laUnica;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + '}';
    }
    
    
    
}
