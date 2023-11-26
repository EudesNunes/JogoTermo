package termo.univille.termo.service.contratos;

import termo.univille.termo.model.FormulariosModel;

public interface SeletorService {
    
    public FormulariosModel RequisicaoInicial();
    public FormulariosModel checarpalavra(FormulariosModel formulario);
}
