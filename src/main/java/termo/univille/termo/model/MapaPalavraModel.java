package termo.univille.termo.model;

import java.util.ArrayList;
import java.util.List;

public class MapaPalavraModel {
    private boolean Ativo;
    private letrasCorretasModel Letra1;    
    private letrasCorretasModel Letra2;
    private letrasCorretasModel Letra3;
    private letrasCorretasModel Letra4;
    private letrasCorretasModel Letra5;

    public MapaPalavraModel() {
    this.Ativo = false;
    this.Letra1 = new letrasCorretasModel();
    this.Letra2 = new letrasCorretasModel();
    this.Letra3 = new letrasCorretasModel();
    this.Letra4 = new letrasCorretasModel();
    this.Letra5 = new letrasCorretasModel();
}

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean ativo) {
        Ativo = ativo;
    }

    public letrasCorretasModel getLetra1() {
        return Letra1;
    }

    public void setLetra1(letrasCorretasModel letra1) {
        Letra1 = letra1;
    }

    public letrasCorretasModel getLetra2() {
        return Letra2;
    }

    public void setLetra2(letrasCorretasModel letra2) {
        Letra2 = letra2;
    }

    public letrasCorretasModel getLetra3() {
        return Letra3;
    }

    public void setLetra3(letrasCorretasModel letra3) {
        Letra3 = letra3;
    }

    public letrasCorretasModel getLetra4() {
        return Letra4;
    }

    public void setLetra4(letrasCorretasModel letra4) {
        Letra4 = letra4;
    }

    public letrasCorretasModel getLetra5() {
        return Letra5;
    }

    public void setLetra5(letrasCorretasModel letra5) {
        Letra5 = letra5;
    }

 

}
