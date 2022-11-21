/*Losango: A = (diagonal maior * diagonal menor) /2 */


import java.util.Scanner;

public class 3Losango {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quanto mede a diagonal maior?");
        int diagonal_maior = in.nextInt();
        System.out.println("Quanto mede a diagonal menor?");
        int diagonal_menor = in.nextInt();
        int area = ((diagonal_maior * diagonal_menor) /2) ;
        System.out.println( "A aréa do losango é igual a : " + area + ".");
    }
}