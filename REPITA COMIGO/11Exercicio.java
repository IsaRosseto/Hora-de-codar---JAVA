/*11 - BOOOOMMM
Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. 
Utilize "document.write" para escrever em tela e no final da repetição escreva "EXPLOSÃO". */

public class 11Exercicio {
    public static void main(String[] args) {

    int contagem = 30;
   
    while (contagem > 0) {
    String textcontagem = "💣" + "Contagem em " + contagem + "💣" +"<br> <br>";
    System.out.println(textcontagem);
    contagem = contagem - 1;
}

 System.out.println("Explosão pluuuuuuuuuuuum ");

    }
}
