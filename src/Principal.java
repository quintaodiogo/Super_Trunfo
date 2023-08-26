import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tema = "";

        try {
            int escolha = 5;
            boolean valido = false;

            while (!valido) {
                try {
                    while (escolha < 1 || escolha > 4) {
                        System.out.println("###### ~ SUPER TRUNFO ~ ######");
                        System.out.println("Bem vindo ao jogo!");
                        System.out.println("Para escolher o tema Aviões, digite 1");
                        System.out.println("Para escolher o tema Carros, digite 2");
                        System.out.println("Para escolher o tema Dinossauros, digite 3");
                        System.out.println("Para escolher o tema Heróis, digite 4");

                        escolha = scanner.nextInt();
                    }

                    valido = true;

                    tema = getTema(escolha);
                } catch (Exception e) {
                    System.out.println("Digite um número válido!");
                    scanner.next();
                }
            }

            Baralho superTrunfo = new Baralho(tema);

            JogadorReal jogador1 = new JogadorReal("João", scanner);
            JogadorRandomico jogador2 = new JogadorRandomico("Joaquina");
            JogadorAbstrato[] jogadores = { jogador1, jogador2 };

            Jogo jogo = new Jogo(jogadores, superTrunfo);
            jogo.iniciarPartida(superTrunfo);
            jogador1.jogarTurno();
            jogo.compararRodada(jogador1.getAtributoEscolhido());
            jogador2.jogarTurno();
            jogo.compararRodada(jogador2.getAtributoEscolhido());
            jogador1.jogarTurno();
            jogo.compararRodada(jogador1.getAtributoEscolhido());
            jogador2.jogarTurno();
            jogo.compararRodada(jogador2.getAtributoEscolhido());
           

        } finally {
            scanner.close();
        }
    }
    public void mostrarVencedor(){
        //Criar lógica do método mostrarVencedor da partida inteira
    }
    
    private static boolean verificarFimDaPartida(JogadorAbstrato[] jogadores) {
        for (JogadorAbstrato jogador : jogadores) {
            if (jogador.getMonte().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private static String getTema(int escolha) {
        String tema = "";
        switch (escolha) {
            case 1:
                tema = "Aviões";
                break;
            case 2:
                tema = "Carros";
                break;
            case 3:
                tema = "Dinossauros";
                break;
            case 4:
                tema = "Heróis";
                break;
        }
        return tema;
    }
}
