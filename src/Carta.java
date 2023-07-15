public class Carta {
    private String nome;
    private String código;

    public Carta(String nome, String código) {
        this.nome = nome;
        this.código = código;
    }

    @Override
    public String toString() {
        return getNome() + " #" + getCódigo();
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

}
