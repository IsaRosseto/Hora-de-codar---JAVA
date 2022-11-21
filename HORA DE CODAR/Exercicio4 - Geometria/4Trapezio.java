/* Trápezio: A = ((base maior + base menor) * h altura ) /2 */

import java.util.Scanner;

public class 4Trapezio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quanto mede a base maior?");
        int base_maior = in.nextInt();

        System.out.println("Quanto mede a base menor?");
        int base_menor = in.nextInt();

        System.out.println("Qual a altura do trapézio?");
        int h = in.nextInt();

        int area = (((base_maior + base_menor) * h ) /2) ;
        
        System.out.println( "A aréa do trapézio é igual a : " + area + ".");
    }
}
