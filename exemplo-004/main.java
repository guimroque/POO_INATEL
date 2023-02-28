public class main {
    public static void main(String[] args) {
        zumbi z1 = new zumbi();
        z1.nome = "Zumbi 1";
        z1.setVelocidade(15);
        z1.setVida(0);
        z1.correr();

        zumbi z2 = new zumbi();
        z2.nome = "Zumbi 2";
        z2.setVelocidade(10);
        z2.setVida(1);
        z2.correr();
    }
}
