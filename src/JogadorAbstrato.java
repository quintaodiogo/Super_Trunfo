public abstract class JogadorAbstrato {
    private String nome;
    private Baralho monte;

    public JogadorAbstrato(String nome) {
        this.nome = nome;
    }

    public abstract void jogarTurno();

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

    // public void CompararCartas(int atributoEscolhido) {
    //     Carta minhaCarta = this.getMonte().peekLast();
    //     double meuValor = Double.parseDouble(minhaCarta.atributoCarta(atributoEscolhido));

    //     for (JogadorAbstrato jogador : outrosJogadores) {
    //         Carta outraCarta = jogador.getMonte().peekLast();
    //         double outroValor = Double.parseDouble(minhaCarta.atributoCarta(atributoEscolhido));

    //         if (meuValor > outroValor) {
    //             System.out.println(this.getNome() + " venceu contra " + jogador.getNome() + "!");
    //         } else if (meuValor < outroValor) {
    //             System.out.println(jogador.getNome() + " venceu contra " + this.getNome() + "!");
    //         } else {
    //             System.out.println("Empate entre " + this.getNome() + " e " + jogador.getNome() + "!");
    //         }
    //         // Adicionar lógica para mover a carta do outro jogador para o monte do ganhador

    //     }
    // }
}
