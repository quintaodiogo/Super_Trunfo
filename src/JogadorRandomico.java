public class JogadorRandomico extends JogadorAbstrato {
    private Baralho monte;

    public JogadorRandomico(String nome) {
        super(nome);

    }

    public void jogarTurno() {
        monte.pegarDoTopo();

    }
}