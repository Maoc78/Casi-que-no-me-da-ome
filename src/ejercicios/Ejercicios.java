
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Miguel Ossa C
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int a;
       int b;
     
        Scanner sc = new Scanner(System.in);
       
       System.out.println ("Ingrese 1 num");
       
       a = sc.nextInt();
       
       System.out.println ("Ingrese 2 num");
       
       b = sc.nextInt();
       
       if (a == b){
           System.out.println ("A y B son iguales");
       } else
       if (a > b) {
           System.out.println ("El mayor es A");
                  }

       else {        
           System.out.println ("El mayor es B");
    }
    }        
        //Yolo        
    }