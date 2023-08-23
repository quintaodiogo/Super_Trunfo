import java.util.Arrays;

public class Carta {
    private String nome;
    private String código;
    private String[] atributos;
    private Boolean supertrunfo;

    // Adicionar Curiosidades
    public Carta(String nome, String código, String[] atributos, Boolean supertrunfo) {
        this.nome = nome;
        this.código = código;
        this.atributos = atributos;
        this.supertrunfo = supertrunfo;
    }

    @Override
    public String toString() {
    return getNome() + " #" + getCódigo() + " Atributos: " + Arrays.toString(getAtributos()) + " Supertrunfo: " + getSupertrunfo();
}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String[] getAtributos() {
        return atributos;
    }

    public void setAtributos(String[] atributos) {
        this.atributos = atributos;
    }

    public Boolean getSupertrunfo() {
        return supertrunfo;
    }

    public void setSupertrunfo(Boolean supertrunfo) {
        this.supertrunfo = supertrunfo;
    }

}
