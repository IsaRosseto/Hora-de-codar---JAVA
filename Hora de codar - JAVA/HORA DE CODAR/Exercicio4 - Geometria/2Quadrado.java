/* Quadrado: A = lado * lado. */

import java.util.Scanner;

public class 2Quadrado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quanto mede o lado do quadrado?");
        int lado = in.nextInt();
        int area = lado * 4 ;
        System.out.println( "A aréa do quadrado é igual a : " + area + ".");
    }
}