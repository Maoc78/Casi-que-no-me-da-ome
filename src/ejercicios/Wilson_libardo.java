package ejercicios;
import java.util.Scanner;

public class Wilson_libardo {
    public static void main(String[] args) {
        int nroHorasTrabajadas;
        double salarioBasico;
        int valorHora;
        int nroHorasExtras;
        
        double salarioDeduccion;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("Ingrese el Nro horas trabajadas");
         nroHorasTrabajadas = sc.nextInt();
         
         System.out.println ("Ingrese el valor pagado por hora");
         valorHora = sc.nextInt();
         
         if (nroHorasTrabajadas <= 120) {
            salarioBasico = nroHorasTrabajadas * valorHora;
            nroHorasExtras = nroHorasTrabajadas - 120;
            salarioBasico = (nroHorasExtras * valorHora * 2) + (120 * valorHora);
            System.out.println ("Salario Basico = " + salarioBasico);
            
            if (salarioBasico <= 480000) {
                salarioDeduccion = salarioBasico - salarioBasico * 0.1;
                System.out.println ("Salrio con deduccion = " + salarioDeduccion);
            } else 
                if (salarioBasico > 480000 && salarioBasico <= 600000){
                    salarioDeduccion = salarioBasico - salarioBasico * 0.2;
                    System.out.println ("Salrio con deduccion = " + salarioDeduccion);
                } else {
                    salarioDeduccion = salarioBasico - salarioBasico * 0.3;
                    System.out.println ("Salrio con deduccion = " + salarioDeduccion);
                }
         }else
             System.out.println ("Todavia no se sabe");
    }
    
}
