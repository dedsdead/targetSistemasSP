import java.util.Scanner;

/**
 * 2) Dado a sequência de Fibonacci, 
 * onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, 
 * informado um número, ele calcule a sequência de Fibonacci e 
 * retorne uma mensagem avisando se o número informado pertence ou não a sequência. 
 */
public class Fibonacci {
    public static int fibo(int n){
        int i = 0;
        int anterior = 0;
        int atual = 1;

        //tamanho da sequencia fixado em 20
        while (i < 20){
            if (anterior == n){
                return anterior;
            }

            int soma = atual+anterior;
            anterior = atual;
            atual = soma;
            
            i++;
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Informe o número para encontrar na sequência: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        if(fibo(numero) != -1){
            System.out.println("Número pertence a sequência!");
        } else {
            System.out.println("Número não pertence a sequência!");
        }

        scan.close();
    }
    
}
