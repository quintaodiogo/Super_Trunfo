public class Jogo {
    JogadorAbstrato[] jogadores;
    Baralho tema;
    int rodada = 0;

    public Jogo(JogadorAbstrato[] jogadores, Baralho tema) {
        this.jogadores = jogadores;
        this.tema = tema;
    }

    public void iniciarPartida(Baralho tema) {
        tema.carregar();
        tema.embaralhar();
        tema.distribuir(jogadores);
    }

    public void compararRodada(int atributoEscolhido) {
        JogadorAbstrato vencedor = null;
        double maiorValor = Double.MIN_VALUE;

        for (JogadorAbstrato jogador : jogadores) {
            Carta carta = jogador.getMonte().peekLast();
            double valorAtributo = Double.parseDouble(carta.atributoCarta(atributoEscolhido));

            if (valorAtributo > maiorValor) {
                vencedor = jogador;
                maiorValor = valorAtributo;
            }
        }

        if (vencedor != null) {
            System.out.println(vencedor.getNome() + " venceu esta rodada!");
            for (JogadorAbstrato jogador : jogadores) {
                if (jogador != vencedor) {
                    moverCartaPerdedora(vencedor, jogador);
                }
            }
        } else {
            System.out.println("Empate nesta rodada!");
        }
    }
    public void mostrarVencedor(){
        
    }
    private void moverCartaPerdedora(JogadorAbstrato jogadorVencedor, JogadorAbstrato jogadorPerdedor) {
        Baralho monteVencedor = jogadorVencedor.getMonte();
        Baralho montePerdedor = jogadorPerdedor.getMonte();

        Carta cartaPerdedora = montePerdedor.pollLast();
        monteVencedor.addLast(cartaPerdedora);
    }

    public void mostrarStatus() {
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(
                    "Jogador: " + jogadores[i].getNome() + " Qtd de Cartas: " + jogadores[i].getMonte().size());
        }
    }
}
