import java.util.Random;

public class JogadorRandomico extends JogadorAbstrato {

    private Random random;

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
        int atributoEscolhido = random.nextInt(4) + 1; // Gera um número entre 1 e 4 aleatoriamente
        System.out.println("Jogador " + getNome() + " escolheu o atributo: " + atributoEscolhido);
    }
}
