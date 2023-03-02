public class main {
    public static void main(String[] args) {
        zumbi z1 = new zumbi();
        z1.nome = "Guilherme";

        zumbi z2 = new zumbi();
        z2.nome = "Miguel";

        z2.vida = 100;

        z1.mostrarVida();
        z2.mostrarVida();

        z2.transfereVida(z1, 50);
        z1.transfereVida(z2, 5);

        z1.mostrarVida();
        z2.mostrarVida();


        //z2 = z1; 
        // -> ponteiro de z2 aponta para o mesmo objeto que o ponteiro de z1 aponta
        // -> qualquer alteracao em uma das instancias (z1 ou z2) afeta a outra
        z1.mostrarVida();
        z2.mostrarVida();
    }
}
