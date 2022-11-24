/*3 - A Bit of Information
Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. 
Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".*/

import java.util.Scanner;
public class 3Exercicio {
    public static void main(String[]args)
    {
        System.out.println("Qual é o seu nome ?");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();

        System.out.println("Qual a sua idade?");
        Int idade = in.nextInt();
        
        System.out.println("Olá, " + nome + ", sua idade é " + idade);

        in.close();
    }
}
