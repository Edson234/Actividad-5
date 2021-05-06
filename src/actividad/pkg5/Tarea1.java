/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5;

/**
 *
 * @author Edson Coj
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] DiaDeLaSemana;
        DiaDeLaSemana = new String[7];
        DiaDeLaSemana [0]= "Lunes";
        DiaDeLaSemana [1]= "Martes";      
        DiaDeLaSemana [2]= "Miercoles";
        DiaDeLaSemana [3]= "Jueves";
        DiaDeLaSemana [4]= "Viernes";
        DiaDeLaSemana [5]= "Sabado";
        DiaDeLaSemana [6]= "Domingo";
        
        for (String DiaSem:DiaDeLaSemana){
            System.out.println(DiaSem);
    }
    }
}
