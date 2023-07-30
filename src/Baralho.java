import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.InputStream;

public class Baralho extends LinkedList<Carta> {
    private String tema;

    // Métodos
    public Baralho(String tema) {
        this.tema = tema;
    }

    public void carregar() {
		String nomeArquivo;
		switch (tema) {
			case "Dinossauros":
				nomeArquivo = "./ArquivoCSV/dinossauros.csv";
				break;
			case "Carros":
				nomeArquivo = "./ArquivoCSV/carros.csv";
				break;
			case "Avioes":
				nomeArquivo = "./ArquivoCSV/avioes.csv";
				break;
				case "Herois":
				nomeArquivo = "./ArquivoCSV/herois.csv";
				break;
			default: nomeArquivo = null;
		}
		if(nomeArquivo!=null){
			try{
				InputStream fluxo = this.getClass().getResourceAsStream(nomeArquivo);
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader leitorComBuffer = new BufferedReader(leitor);
				String linha;
				while((linha = leitorComBuffer.readLine())!=null){
					String [] dados = linha.split(",");
					String nome = dados[0].trim();
					String codigo = dados[1].trim();
					Carta carta = new Carta(nome, codigo);
					this.add(carta);
				}
				leitorComBuffer.close();
			}catch(IOException e){
				System.out.println("Erro ao ler o arquivo CSV: "+ e.getMessage());
			}
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
