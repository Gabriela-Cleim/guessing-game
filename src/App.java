/*Jogo de Adivinhação: Implemente um jogo simples em que o computador escolhe um número 
aleatório e o jogador tem que adivinhar esse número. 
Use variáveis para armazenar o número  */

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); // aqui cria o scanner
        Random random = new Random(); // aqui cria o random

        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório de 1 a 100
        int tentativas = 0; //conta as tentativas do usuario
        int palpite; //variavel para pegar o valor digitado pelo usuario

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do { //faça isso
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt(); //recupera o valor digitado
            tentativas++; //incrementa a tentativa, inicia sendo zero e agora é 1

            if (palpite < numeroAleatorio) { //se o valor digitado for menor que o numero gerado
                System.out.println("Tente um número maior."); 
            } else if (palpite > numeroAleatorio) { // e se o valor digitado for maior que o numero gerado
                System.out.println("Tente um número menor.");
            } else { // se não
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio +
                                   " em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroAleatorio); //enqunato o valor digitado for diferente do numero gerado

        scanner.close();
    }
}
