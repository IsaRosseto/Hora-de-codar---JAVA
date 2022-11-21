/*7.1 - 5 vezes?
Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.*/

import java.util.Scanner;

public class Exercicio7.1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int maior1 = 0;
        int maior2 = 0;



        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();

            if(numero > 0){
                if(numero > maior1){
                    if(i >= 1){
                        maior2 = maior1;
                    }
                    maior1 = numero;
                }else if(numero > maior2){
                    maior2 = numero;
                }
            }

        }
        int resultado = maior1 + maior2;
        System.out.println("A soma dos maiores é: " + resultado);

    }
}