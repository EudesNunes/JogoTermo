package termo.univille.termo.service.contratos;

import java.util.List;

import termo.univille.termo.model.letrasCorretasModel;

public interface SeletorService {
    
    public String palavraSelecionada();
    public List<letrasCorretasModel> checarpalavra(String palavra, String palavraJogador);
}
