public abstract class JogadorAbstrato {
    private String nome;
    private Baralho monte;

    public JogadorAbstrato(String nome) {
        this.nome = nome;
    }

    public void jogarTurno(){
        System.out.println(monte.peekLast());
        System.out.println("Escolha um atributo :");
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
