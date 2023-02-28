public class zumbi {

    // Atributos que existem dentro desse objeto
    public // settador como publicos(valores acessíveis fora da classe)
    String nome;
    private // settados como privados(valores acessíveis apenas dentro da classe)
        int vida;
        boolean vivo;
        int velocidade;


    public void correr(){
        String valuePrint = vivo ? "Em movimento, velocidade: "+ velocidade : "Zumbi morto";
        System.out.println(valuePrint);
    }

    public void setVelocidade(int vel){
        this.velocidade = vel;
    }

    public void setVida(int vida){
        this.vivo = vida > 0;
        this.vida = vida;
    }

}

