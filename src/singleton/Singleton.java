/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author noese
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Persona obx1 = new Persona();
        Persona obx2= new Persona();
        obx1.pedirDatos();
        obx2.pedirDatos();
        
        System.out.println(obx1.toString());
*/
       
      Persona obx1=Persona.getInstance("Joselito", 15 , "Eduardo");
      Persona obx2=Persona.GetInstance();
        System.out.println(obx1.toString());
        System.out.println("objeto 2");
        System.out.println(obx2.toString());
    
}
}