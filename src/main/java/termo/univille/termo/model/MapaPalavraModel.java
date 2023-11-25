package termo.univille.termo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapaPalavraModel {
    private boolean Ativo;
    private List<letrasCorretasModel> Letras;

    public MapaPalavraModel() {
        this.Ativo = false;
        this.Letras = new ArrayList<>(Arrays.asList(new letrasCorretasModel(),
                new letrasCorretasModel(),
                new letrasCorretasModel(),
                new letrasCorretasModel(),
                new letrasCorretasModel()));
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean ativo) {
        Ativo = ativo;
    }

    public List<letrasCorretasModel> getLetras() {
        return Letras;
    }

    public void setLetras(List<letrasCorretasModel> letras) {
        Letras = letras;
    }

}
