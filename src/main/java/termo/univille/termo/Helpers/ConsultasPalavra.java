package termo.univille.termo.Helpers;

import termo.univille.termo.Enums.EnumStatus;
import termo.univille.termo.model.MapaPalavraModel;
import termo.univille.termo.model.letrasCorretasModel;

public class ConsultasPalavra {

    public static MapaPalavraModel verificarLetras(String palavra, MapaPalavraModel palavraModel) {

        for (letrasCorretasModel caracter : palavraModel.getLetras()) {
            int posicao =0;
            EnumStatus status = EnumStatus.ERRADO;
            if (palavra.contains(String.valueOf(caracter.Letra))) {
                status = EnumStatus.EXISTE;
                if (palavra.charAt(posicao) == caracter.getLetra().charAt(0)) {
                    status = EnumStatus.CORRETO;
                }
            }
            caracter.setStatus(status);
            posicao +=0;
        }
        palavraModel.setAtivo(false);
        return palavraModel;

    }
}
