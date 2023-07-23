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

        if (tema.equals("Dinossauros")) {
            this.add(new Carta("Super Trunfo", "0"));
            this.add(new Carta("Tiranossauro Rex", "1A"));
            this.add(new Carta("Pterodátilo", "1B"));
            this.add(new Carta("Velociraptor", "1C"));
            this.add(new Carta("Estegossauro", "1D"));
            this.add(new Carta("Diplodoco", "2A"));
            this.add(new Carta("Braquiossauro", "2B"));
            this.add(new Carta("Argentinossauro", "2C"));
            this.add(new Carta("Brontossauro", "2D"));
            this.add(new Carta("Tricerátops", "3A"));
            this.add(new Carta("Stegossauro", "3B"));
            this.add(new Carta("Anquilossauro", "3C"));
            this.add(new Carta("Archaeopteryx", "3D"));
            this.add(new Carta("Apatossauro", "4A"));
            this.add(new Carta("Compsognato", "4B"));
            this.add(new Carta("Mosassauro", "4C"));
            this.add(new Carta("Plesiossauro", "4D"));
            this.add(new Carta("Pterossauro", "5A"));
            this.add(new Carta("Espinossauro", "5B"));
            this.add(new Carta("Dimetrodonte", "5C"));
            this.add(new Carta("Tiranossauro Rex", "5D"));
            this.add(new Carta("Tiranossauro Rex", "6A"));
            this.add(new Carta("Pte", "6B"));
            this.add(new Carta("Velociraptor", "6C"));
            this.add(new Carta("Estegossauro", "6D"));
            this.add(new Carta("Diplodoco", "7A"));
            this.add(new Carta("Braquiossauro", "7B"));
            this.add(new Carta("Argentinossauro", "7C"));
            this.add(new Carta("Brontossauro", "7D"));
            this.add(new Carta("Tricerátops", "8A"));
            this.add(new Carta("Stegossauro", "8B"));
            this.add(new Carta("Anquilossauro", "8C"));
            this.add(new Carta("Archaeopteryx", "8D"));

        } else if (tema.equals("Barbie")) {
            this.add(new Carta("Super Trunfo", "0"));
            this.add(new Carta("Barbie", "1A"));
            this.add(new Carta("Ken", "1B"));
            this.add(new Carta("Teresa", "1C"));
            this.add(new Carta("Skipper", "1D"));
            this.add(new Carta("Chelsea", "2A"));
            this.add(new Carta("Stacie", "2B"));
            this.add(new Carta("Raquelle", "2C"));
            this.add(new Carta("Christie", "2D"));
            this.add(new Carta("Nikki", "3A"));
            this.add(new Carta("Midge", "3B"));
            this.add(new Carta("Francie", "3C"));
            this.add(new Carta("Summer", "3D"));
            this.add(new Carta("Midge", "4A"));
            this.add(new Carta("Tutti", "4B"));
            this.add(new Carta("Shani", "4C"));
            this.add(new Carta("Theresa", "4D"));
            this.add(new Carta("Skipper", "5A"));
            this.add(new Carta("Chelsea", "5B"));
            this.add(new Carta("Teresa", "5C"));
            this.add(new Carta("Ken", "5D"));
            this.add(new Carta("Barbie", "6A"));
            this.add(new Carta("Skipper", "6B"));
            this.add(new Carta("Stacie", "6C"));
            this.add(new Carta("Summer", "6D"));
            this.add(new Carta("Nikki", "7A"));
            this.add(new Carta("Raquelle", "7B"));
            this.add(new Carta("Francie", "7C"));
            this.add(new Carta("Christie", "7D"));
            this.add(new Carta("Shani", "8A"));
            this.add(new Carta("Theresa", "8B"));
            this.add(new Carta("Tutti", "8C"));
            this.add(new Carta("Midge", "8D"));

        } else if (tema.equals("Bob Esponja")) {
            this.add(new Carta("Super Trunfo", "0"));
            this.add(new Carta("Bob Esponja", "1A"));
            this.add(new Carta("Patrick Estrela", "1B"));
            this.add(new Carta("Lula Molusco", "1C"));
            this.add(new Carta("Sandy Bochechas", "1D"));
            this.add(new Carta("Sr. Siriguejo", "2A"));
            this.add(new Carta("Plankton", "2B"));
            this.add(new Carta("Gary", "2C"));
            this.add(new Carta("Karen", "2D"));
            this.add(new Carta("Sra. Puff", "3A"));
            this.add(new Carta("Pearl", "3B"));
            this.add(new Carta("Larry Lagosta", "3C"));
            this.add(new Carta("Mancha Negra", "3D"));
            this.add(new Carta("Holandês Voador", "4A"));
            this.add(new Carta("Bolhas", "4B"));
            this.add(new Carta("Homem Sereia", "4C"));
            this.add(new Carta("Mexilhãozinho", "4D"));
            this.add(new Carta("Karen", "5A"));
            this.add(new Carta("Sra. Puff", "5B"));
            this.add(new Carta("Plankton", "5C"));
            this.add(new Carta("Gary", "5D"));
            this.add(new Carta("Bob Esponja", "6A"));
            this.add(new Carta("Lula Molusco", "6B"));
            this.add(new Carta("Patrick Estrela", "6C"));
            this.add(new Carta("Sandy Bochechas", "6D"));
            this.add(new Carta("Sr. Siriguejo", "7A"));
            this.add(new Carta("Pearl", "7B"));
            this.add(new Carta("Larry Lagosta", "7C"));
            this.add(new Carta("Mancha Negra", "7D"));
            this.add(new Carta("Holandês Voador", "8A"));
            this.add(new Carta("Bolhas", "8B"));
            this.add(new Carta("Homem Sereia", "8C"));
            this.add(new Carta("Mexilhãozinho", "8D"));
        }
    }

    public void embaralhar() {
        Collections.shuffle(this);
    }

    public void distribuir(JogadorAbstrato[] jogadores) {
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
