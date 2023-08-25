public class Atributo {
    private String nome_atributo;
    private Double valor;
    private String unidadeDeMedida;

    public Atributo(String nome_atributo, Double valor, String unidadeDeMedida) {
        this.nome_atributo = nome_atributo;
        this.valor = valor;
        this.unidadeDeMedida = unidadeDeMedida;
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

}