public class Personagem {
    
    String nome;
    int pontos;
    Arma arma; // -> agregação de objetos

    void usarArma(){
        this.arma.resistencia -= 2;
    }

    void tomarDano(){
        this.pontos -= 5;
    }

}