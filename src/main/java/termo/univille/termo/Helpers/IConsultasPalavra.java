package termo.univille.termo.Helpers;

import termo.univille.termo.model.MapaPalavraModel;

public interface IConsultasPalavra {

    public boolean ExisteBanco(MapaPalavraModel palavraModel);

    public MapaPalavraModel verificarLetras(String palavra, MapaPalavraModel palavraModel);

    public boolean vitoria(MapaPalavraModel palavraModel);
}
