public class Jogo {
    public static void main(String[] args) {
        JogadorAbstrato jogador1 = new JogadorAbstrato("João");
        JogadorAbstrato jogador2 = new JogadorAbstrato("Maria");
        Baralho superTrunfo = new Baralho("Bob Esponja");
        System.out.println("Baralho carregado com o tema " + superTrunfo.getTema() + ":");
        superTrunfo.carregar();
        superTrunfo.listarCartas();
        System.out.println("\nBaralho embaralhado:");
        superTrunfo.embaralhar();
        superTrunfo.listarCartas();
        superTrunfo.distribuir(new JogadorAbstrato[] { jogador1, jogador2 });
        System.out.println("\nMonte do primeiro jogador:");
        jogador1.getMonte().listarCartas();
        System.out.println("\nMonte do segundo jogador:");
        jogador2.getMonte().listarCartas();
        System.out.println("\nRetirando a carta do topo do monte do primeiro jogador:");
        System.out.println(jogador1.getMonte().pegarDoTopo());
        System.out.println("\nRetirando a carta do topo do monte do segundo jogador:");
        System.out.println(jogador2.getMonte().pegarDoTopo());

    }
}
