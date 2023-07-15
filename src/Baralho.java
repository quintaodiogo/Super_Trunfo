import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Baralho extends LinkedList<Carta> {
    private String tema;

    // Métodos 
    public Baralho(String tema) {
        this.tema = tema;
    }

    public void carregar() {

        if (tema.equals("Dino")) {
            this.add(new Carta("Rex", "01"));
            this.add(new Carta("Pte", "02"));
            this.add(new Carta("Velociraptor", "03"));
            this.add(new Carta("Estegossauro", "04"));
            this.add(new Carta("Diplodoco", "05"));
            this.add(new Carta("Braquiossauro", "06"));
            this.add(new Carta("Argentinossauro", "07"));
            this.add(new Carta("Brontossauro", "08"));

        } else if (tema.equals("Barbie")) {
            this.add(new Carta("Ken", "01"));
            this.add(new Carta("Barbie", "02"));
            this.add(new Carta("Tereza", "03"));
            this.add(new Carta("Raquelle", "04"));
            this.add(new Carta("Chelsea", "05"));
            this.add(new Carta("Slyder", "06"));
            this.add(new Carta("Lydia", "07"));
            this.add(new Carta("Alexa", "08"));

        } else if (tema.equals("Bob Esponja")) {
            this.add(new Carta("Bob Esponja", "01"));
            this.add(new Carta("Garry", "02"));
            this.add(new Carta("Lula Molusco", "03"));
            this.add(new Carta("Patrick", "04"));
            this.add(new Carta("Patty", "05"));
            this.add(new Carta("Sirigueijo", "06"));
            this.add(new Carta("Plankton", "07"));
            this.add(new Carta("Sandy", "08"));
            this.add(new Carta("Larry", "09"));
            this.add(new Carta("Sra Puff", "10"));

        }
    }

    public void embaralhar() {
        Collections.shuffle(this);
    }

    public void distribuir(Jogador[] jogadores) {
        int jogador = 0;
        Iterator<Carta> iterador = this.iterator();

        while (iterador.hasNext()) {
            if (jogadores[jogador].getMonte() == null)
                jogadores[jogador].setMonte(new Baralho(this.tema));
            jogadores[jogador].getMonte().add(iterador.next());
            iterador.remove();
            jogador = (jogador + 1) % jogadores.length;
        }
    }

    public void listarCartas() {
        System.out.println(this);
    }

    public Carta pegarDoTopo() {
        if (this.peekLast() != null)
            return this.pollLast();

        System.out.println("O monte não tem mais cartas!");
        return null;
    }

    // Getters and setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

}
