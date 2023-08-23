public class Jogo {
    JogadorAbstrato[] jogadores;
    Baralho tema;

    public Jogo(JogadorAbstrato[] jogadores, Baralho tema) {
        this.jogadores = jogadores;
        this.tema = tema;
    }

    public void iniciarPartida(Baralho tema) {
        tema.carregar();
        tema.embaralhar();
        tema.distribuir(jogadores);
    }

    public void mostrarVencedor() {

        // for (int i = 0; i < jogadores.length; i++) {
        //     if (jogadores[i].getMonte().size() == 0) {
        //         System.out.println("Parabéns pela vitória!");
        //     } else {
        //         System.out.println("Jogador "+jogadores[i].getNome()+". Não foi dessa vez, mas lembre-se de que em cada jogo há valiosas lições a serem aprendidas.");
        //     }
        // }
    }

    public void mostrarStatus() {
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(
                    "Jogador: " + jogadores[i].getNome() + " Qtd de Cartas: " + jogadores[i].getMonte().size());
        }
    }
}
