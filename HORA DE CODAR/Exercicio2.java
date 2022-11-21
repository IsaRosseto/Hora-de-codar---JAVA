/*2 -  Hello Clarice
Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]". */

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[]args)
    {
        System.out.println("Qual é o seu nome ?");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        System.out.println("Olá, " + nome );

        in.close();
    }
}