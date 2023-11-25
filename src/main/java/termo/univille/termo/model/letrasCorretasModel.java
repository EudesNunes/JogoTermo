package termo.univille.termo.model;

import termo.univille.termo.Enums.EnumStatus;

public class letrasCorretasModel {
    public String Letra;
    public EnumStatus Status;


    public letrasCorretasModel(){
        this.Letra = "";
        this.Status = EnumStatus.NULO;
    }


    public letrasCorretasModel(String letra, EnumStatus status, int posicao) {
        Letra = letra;
        Status = status;
    }
    public String getLetra() {
        return Letra;
    }
    public void setLetra(String letra) {
        Letra = letra;
    }
    public EnumStatus getStatus() {
        return Status;
    }
    public void setStatus(EnumStatus status) {
        Status = status;
    }
 
    
}
