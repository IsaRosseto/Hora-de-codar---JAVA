/* Circulo: A = pi * r2 */

import java.util.Scanner;

public class 7Circulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o valor do raio?");
        int raio = in.nextInt();
        System.out.println( "A area do circulo é igual a : " +  ((raio * raio)* 3.14)  + ".");
    }
}
    