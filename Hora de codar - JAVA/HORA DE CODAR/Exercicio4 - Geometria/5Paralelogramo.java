/* paralelogramo: A = base * altura */

import java.util.Scanner;

public class 5Paralelogramo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o valor da base?");
        int base = in.nextInt();
        System.out.println("Qual o valor da altura?");
        int altura = in.nextInt();
        int area = base * altura;
        System.out.println( "A aréa do paralelogramo é igual a : " + area + ".");
    }