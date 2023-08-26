public abstract class JogadorAbstrato {
    private String nome;
    private Baralho monte;
    public Jogo jogo;

    public JogadorAbstrato(String nome) {
        this.nome = nome;
    }

    public abstract void jogarTurno();

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Baralho getMonte() {
        return monte;
    }

    public void setMonte(Baralho monte) {
        this.monte = monte;
    }

}
