package ejercicios;
import java.util.Scanner;

public class parque {
    
     public static void main(String[] args) {
         int edad;
         
         Scanner sc = new Scanner(System.in);
       
       System.out.println ("Ingrese edad");
       edad = sc.nextInt();
       
       if (edad >= 0 && edad <= 12){
        System.out.println ("Pague 1000");
         
     }else
        if (edad >= 13 && edad <= 19){
           System.out.println ("Pague 2000");
        
        }else {
           System.out.println ("Pague 3000 Pesitos"); 
        }
       
     }
        
       
}
