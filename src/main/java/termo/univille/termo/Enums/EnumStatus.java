package termo.univille.termo.Enums;

public enum EnumStatus {
    CORRETO("Correto"),
    ERRADO("Errado"),
    EXISTE("Local Errado");

    private final String descricao;

    EnumStatus(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
