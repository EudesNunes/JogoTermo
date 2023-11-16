package termo.univille.termo.Helpers;

import termo.univille.termo.Enums.EnumStatus;
import termo.univille.termo.model.letrasCorretasModel;

public class ConsultasPalavra {

    public static letrasCorretasModel verificarLetra(String palavra, char letraIndicada, int posicao) {
        EnumStatus status = EnumStatus.ERRADO;
        if (palavra.contains(String.valueOf(letraIndicada))) {
            status = EnumStatus.EXISTE;
            if (palavra.charAt(posicao) == letraIndicada) {
                status = EnumStatus.CORRETO;
            }
        }
        return new letrasCorretasModel(letraIndicada, status, posicao);

    }
}
