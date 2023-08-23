import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

		String nomeDoArquivo = "";

		switch (this.tema) {
			case "Aviões":
				nomeDoArquivo = "src/ArquivoCSV/avioes.csv";
				break;
			case "Carros":
				nomeDoArquivo = "src/ArquivoCSV/carros.csv";
				break;
			case "Heróis":
				nomeDoArquivo = "src/ArquivoCSV/herois.csv";
				break;
			case "Dinossauros":
				nomeDoArquivo = "src/ArquivoCSV/dinossauros.csv";
				break;
		}

		InputStream fluxo = null;
		InputStreamReader leitor = null;
		BufferedReader leitorComBuffer = null;

		try {
			fluxo = new FileInputStream(nomeDoArquivo);
			leitor = new InputStreamReader(fluxo);
			leitorComBuffer = new BufferedReader(leitor);

			String linha = "";

			linha = leitorComBuffer.readLine();
			linha = leitorComBuffer.readLine();
			while (linha != null) {
				// Inside the while loop
				String[] dadosDaCarta = linha.split(",");

				String nome = dadosDaCarta[0];
				String código = dadosDaCarta[1];

				String[] atributos = new String[dadosDaCarta.length - 3]; 
				System.arraycopy(dadosDaCarta, 2, atributos, 0, atributos.length);
				
				for (int i = 0; i < atributos.length; i++) {
					atributos[i] = atributos[i].trim(); 

				}

				boolean supertrunfo = Boolean.parseBoolean(dadosDaCarta[dadosDaCarta.length - 1]);

				Carta novaCarta = new Carta(nome, código, atributos, supertrunfo);
				this.add(novaCarta);
				linha = leitorComBuffer.readLine();


			}

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				leitorComBuffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
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
