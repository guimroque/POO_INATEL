public class Main {
    
    public static void main(String[] args) {
        
        Personagem p1 = new Personagem();
        p1.nome = "Guilherme";
        p1.pontos = 100;
        
        Arma a1 = new Arma();
        a1.nome = "Espada";
        a1.poder = 10;
        a1.resistencia = 100;
        a1.descricao = "Uma espada comum";

        p1.arma = a1;

        System.out.println("Nome do personagem: " + p1.nome + "   - Vida: " + p1.pontos);
        p1.tomarDano();
        System.out.println("Nome do personagem: " + p1.nome + "   - Vida: " + p1.pontos);

        p1.arma.mostraInfoArma();
        p1.usarArma();
        p1.arma.mostraInfoArma();
    }
    

}
