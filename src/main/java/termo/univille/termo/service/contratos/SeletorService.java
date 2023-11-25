package termo.univille.termo.service.contratos;

import java.util.List;

import termo.univille.termo.model.FormulariosModel;
import termo.univille.termo.model.letrasCorretasModel;

public interface SeletorService {
    
    public FormulariosModel RequisicaoInicial();
    public List<letrasCorretasModel> checarpalavra(String palavra, String palavraJogador);
}
