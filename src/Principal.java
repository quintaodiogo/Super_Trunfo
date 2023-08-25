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
            JogadorAbstrato[] jogadores = {jogador1, jogador2};

            Jogo jogo = new Jogo(jogadores, superTrunfo);
            jogo.iniciarPartida(superTrunfo);
            jogador1.jogarTurno();
            jogador2.jogarTurno();
            jogo.mostrarStatus();

        } finally {
            scanner.close();
        }
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
