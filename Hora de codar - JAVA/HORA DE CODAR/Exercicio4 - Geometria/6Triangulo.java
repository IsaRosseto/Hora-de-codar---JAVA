/* Triangulo: A = (base * altura) /2 */

import java.util.Scanner;

public class 6Triangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o valor da base?");
        int base = in.nextInt();
        System.out.println("Qual o valor da altura?");
        int altura = in.nextInt();
        int area = (base * altura) /2 ;
        System.out.println( "A area do triangulo é igual a : " + area + ".");
    }
}
    