import java.util.Scanner;

/**
 * 5) Escreva um programa que inverta os caracteres de um string. 
 * IMPORTANTE: 
 *  a) Essa string pode ser informada através de qualquer entrada de sua preferência ou 
 *      pode ser previamente definida no código; 
 *  b) Evite usar funções prontas, como, por exemplo, reverse; 
 */
public class InvertePalavra {
    public static String palavra(String p) {
        int i = p.length()-1;
        String arvalaP = "";
        while (i >= 0){
            arvalaP+=p.charAt(i);
            i--;
        }
        return arvalaP;
    }
    public static void main(String[] args) {
        System.out.println("Informe a palavra a ser invertida: ");
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        
        System.out.println(palavra(palavra));

        scan.close();
    }
    
}
