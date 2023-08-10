public class Atributo extends Carta {
    private String nome_atributo;
    private Double valor;
    private String unidadeDeMedida;
    private boolean supertrunfo;

    public Atributo(String nome, String código, String nome_atributo, Double valor, String unidadeDeMedida, boolean supertrunfo) {
        super(nome, código);
        this.nome_atributo = nome_atributo;
        this.valor = valor;
        this.unidadeDeMedida = unidadeDeMedida;
        this.supertrunfo = supertrunfo;
    }

    @Override
    public String toString() {
        return "Atributo [nome_atributo=" + nome_atributo + ", valor=" + valor + ", unidadeDeMedida=" + unidadeDeMedida
                + "]";
    }

    // Getters 
    public String getNome_atributo() {
        return nome_atributo;
    }

    public Double getValor() {
        return valor;
    }


    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public boolean isSupertrunfo() {
        return supertrunfo;
    }

}
