public class Principal {
    public static void main(String[] args) {
    // System.out.println("###### ~ SUPER TRUNFO ~ ######");
    // System.out.println("Bem vinde ao jogo!");
    // System.out.println("Para escolher o tema Aviões, digite Aviões!");
    // System.out.println("Para escolher o tema Carros, digite Carros!");
    // System.out.println("Para escolher o tema Dinossauros, digite Dinossauros!");
    // System.out.println("Para escolher o tema Heróis, digite Heróis!");

        JogadorReal jogador1 = new JogadorReal("João");
        JogadorReal jogador2 = new JogadorReal("Maria");
        JogadorRandomico jogador3 = new JogadorRandomico("Tnay");
        JogadorAbstrato[] jogadores = {jogador1,jogador2,jogador3};
         Baralho superTrunfo = new Baralho("Aviões");
        Jogo rodada01 = new Jogo(jogadores,superTrunfo);
        rodada01.iniciarPartida(superTrunfo);
        rodada01.mostrarStatus();
        rodada01.mostrarVencedor();

    }
}
