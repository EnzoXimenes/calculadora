/** Uma classe para realizar operações matemáticas básicas
 * @author Enzo
 * @version 1.0
 * @since 2026-15-05
 */

public class Calculadora {
    
public static void somar(int a,int b) {
        
        System.out.println("A soma de " + a + " + " + b + " é igual a: " + (a+b)); 
       
    }
public static void multiplicar(int a, int b) {
     System.out.println("A multiplicação de " + a +  "+ " + b + " é igual a: " + (a*b));
     }
public static void dividir(int a, int b) {
        System.out.println("A divisão de " + a + " + " + b + " é igual a: " + (a/b)    );

        
    }
public static void subtracao(int a, int b) {
        System.out.println("A subtração de " + a + " + " + b + " é igual a: " + (a-b)    );
    }
}
