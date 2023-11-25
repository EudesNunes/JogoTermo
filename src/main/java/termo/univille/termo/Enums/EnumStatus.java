package termo.univille.termo.Enums;

public enum EnumStatus {
    CORRETO(1,"Correto"),
    ERRADO(2,"Errado"),
    EXISTE(3,"Local Errado"),
    NULO(4,"Vazio");

    private final int numero;
    private final String descricao;

    EnumStatus(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

}
