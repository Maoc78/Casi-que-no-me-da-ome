package ejercicios;
import java.util.Scanner;

public class Prueba {
    
    public static void main(String[] args) {
       int a;
       int b;
       int g;
     
        Scanner sc = new Scanner(System.in);
       
       System.out.println ("Ingrese 1 num");       
       a = sc.nextInt();
       
       System.out.println ("Ingrese 2 num");       
       b = sc.nextInt();
       
        if (a > b) {
            g = a - b;            
            System.out.println ("a - b = " + g);            
        } else            
            if (a < b) {                
                g = a + b;
                System.out.println ("a + b = " + g);
            }else {
                g = a * b;
                System.out.println ("a * b = " + g);
            }        
   }    
}
