public class Principal {
    public static void main(String[] args) {
        JogadorReal jogador1 = new JogadorReal("João");
        JogadorReal jogador2 = new JogadorReal("Maria");
        JogadorRandomico jogador3 = new JogadorRandomico("Tnay");
        JogadorAbstrato[] jogadores = {jogador1,jogador2,jogador3};
         Baralho superTrunfo = new Baralho("Aviões");
        Jogo rodada01 = new Jogo(jogadores,superTrunfo);
        rodada01.jogar(superTrunfo);
    }
}
