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
                    while (escolha < 1 || escolha > 4){
                        System.out.println("###### ~ SUPER TRUNFO ~ ######");
                        System.out.println("Bem vindo ao jogo!");
                        System.out.println("Para escolher o tema Aviões, digite 1");
                        System.out.println("Para escolher o tema Carros, digite 2");
                        System.out.println("Para escolher o tema Dinossauros, digite 3");
                        System.out.println("Para escolher o tema Heróis, digite 4");
                        
                        escolha = scanner.nextInt();
                    }

                    valido = true;
                    
                    if (escolha == 1) {
                        tema = "Aviões";
                    }
                    else if (escolha == 2) {
                        tema = "Carros";
                    }
                    else if (escolha == 3) {
                        tema = "Dinossauros";
                    }
                    else {
                        tema = "Heróis";
                    }
                }
                catch (Exception e) {
                    System.out.println("Digite um número válido!");
                    scanner.next();
                }
            }
        }
        finally {
            scanner.close();
        }
        
        Baralho superTrunfo = new Baralho(tema);

        JogadorReal jogador1 = new JogadorReal("João");
        JogadorRandomico jogador2 = new JogadorRandomico("Joaquina");
        JogadorAbstrato[] jogadores = {jogador1, jogador2};
        
        Jogo rodada01 = new Jogo(jogadores,superTrunfo);
        rodada01.iniciarPartida(superTrunfo);
        rodada01.mostrarStatus();
        rodada01.mostrarVencedor();

    }
}
