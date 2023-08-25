import java.util.Scanner;

public class JogadorReal extends JogadorAbstrato {
    private Scanner scanner;

    public JogadorReal(String nome, Scanner scanner) {
        super(nome);
        this.scanner = scanner;
    }

    public void jogarTurno() {
        System.out.println();
        System.out.println(this.getMonte().peekLast());
        escolherAtribtuto();
    }

    public void escolherAtribtuto() {
        int atributo;

        do {
            System.out.println("Escolha seu melhor atributo de 1 a 4:");

            while (!scanner.hasNextInt()) {
                System.out.println("Digite um número válido!");
                scanner.next(); // Limpar entrada inválida
            }

            atributo = scanner.nextInt();

        } while (atributo < 1 || atributo > 4);

        System.out.println("Você escolheu o atributo: " + atributo);
    }

}
