import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da sua NPA: ");
        int NPA = input.nextInt();


        if(NPA >= 60){
            System.out.println("Você foi aprovado!");
        }else{
            System.out.print("Você ainda não foi aprovado, digite a nota da NP3: ");
            int NP3 = input.nextInt();
            float result = (NP3 + NPA)/2;

            System.out.println(
                "O resultado das suas notas é " + result + " voce foi " + (result >= 50 ? "aprovado" : "reprovado")
            );
        }
    }
}