package termo.univille.termo.model;

import termo.univille.termo.Enums.EnumStatus;

public class letrasCorretasModel {
    public char Letra;
    public EnumStatus Status;
    public int posicao;

    public letrasCorretasModel(char letra, EnumStatus status, int posicao) {
        Letra = letra;
        Status = status;
        this.posicao = posicao;
    }
    public char getLetra() {
        return Letra;
    }
    public void setLetra(char letra) {
        Letra = letra;
    }
    public EnumStatus getStatus() {
        return Status;
    }
    public void setStatus(EnumStatus status) {
        Status = status;
    }
    public int getPosicao() {
        return posicao;
    }
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
}
