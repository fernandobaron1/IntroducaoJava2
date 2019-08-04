
package introducaojava2;

import java.util.Scanner;


public class IntroducaoJava2 {

    
    public static void main(String[] args) {
       
        Scanner leia = new Scanner(System.in);
        
        System.out.println ("Qual o seu nome?:");
         String nome = leia.nextLine();
        
        System.out.println ("Informe o peso:");
        double peso = leia.nextDouble();
        
        System.out.println ("Informe a altura:");
        double altura = leia.nextDouble();
        
        double imc = peso/(altura * altura);
        System.out.println ("O resultado do IMC do "+nome+" "+imc);
        
        /*System.out.println(resultado);*/
    }
    
}
