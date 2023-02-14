import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        int numero = valores.nextInt();
        valores.close();

        System.out.println("Quantidade digitada: " + numero);

    }
}