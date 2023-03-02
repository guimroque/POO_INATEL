public class zumbi {
    public double vida = 0;
    String nome;

    double mostrarVida() {
        System.out.println("Vida "+"do zumbi "+this.nome+": " + this.vida);
        return this.vida;
    }

    boolean transfereVida(zumbi zumbiAlvo, double quantidade) {
        if (this.vida < quantidade) {
            return false;
        }
        zumbiAlvo.vida += quantidade;
        this.vida -= quantidade;

        return true;
    }
}