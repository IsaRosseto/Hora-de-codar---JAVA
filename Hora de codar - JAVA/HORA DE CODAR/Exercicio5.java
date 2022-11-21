/*5 - 1, 2 e 3
Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.*/

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args)
    {   
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número");   
        int numero = in.nextInt();

        if(numero > 0){
            System.out.println("Seu número é positivo");
        }else if( numero < 0){
            System.out.println("Seu número é negativo");
        }else{
            System.out.println("Seu número é ZERO");
        }

        in.close();
    }
}