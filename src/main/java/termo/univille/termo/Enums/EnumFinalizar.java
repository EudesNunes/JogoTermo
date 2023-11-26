package termo.univille.termo.Enums;

public enum EnumFinalizar {
    GANHO(1,"Ganhou"),
    PERDA(2,"Perdeu"),
    NULO(3,"Vazio");

    private final int numero;
    private final String descricao;

    EnumFinalizar(int numero, String descricao) {
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
