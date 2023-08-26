import java.util.Random;

public class JogadorRandomico extends JogadorAbstrato {

    private Random random;
    int atributoEscolhido; // Gera um número entre 1 e 4 aleatoriamente

    public JogadorRandomico(String nome) {
        super(nome);
        random = new Random();
    }

    public void jogarTurno() {
        System.out.println();
        System.out.println(this.getMonte().peekLast());

        escolherAtributo();
    }

    public void escolherAtributo() {
        System.out.println("Jogador " + getNome() + " escolheu o atributo: " + getAtributoEscolhido());
    }
    public int getAtributoEscolhido(){
        int atributoEscolhido = random.nextInt(4) + 1;
        return atributoEscolhido;
    }
    
}
