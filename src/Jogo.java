public class Jogo {
    JogadorAbstrato[] jogadores;
    Baralho tema;

   

    public Jogo(JogadorAbstrato[] jogadores, Baralho tema) {
        this.jogadores = jogadores;
        this.tema = tema;
    }

    public void jogar(Baralho tema) {
        tema.carregar();
        tema.embaralhar();
        tema.distribuir(jogadores);
    }

    public void mostrarVencedor() {

    }

    public void mostrarStatus() {

    }
}
