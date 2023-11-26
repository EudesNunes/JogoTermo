package termo.univille.termo.Helpers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import termo.univille.termo.Enums.EnumStatus;
import termo.univille.termo.model.MapaPalavraModel;
import termo.univille.termo.model.letrasCorretasModel;

@Component
public class ConsultasPalavra implements IConsultasPalavra {

     @Autowired
    private termo.univille.termo.ConsultaTexto.contratos.leitor leitor;

    public  MapaPalavraModel verificarLetras(String palavra, MapaPalavraModel palavraModel) {
            int posicao =0;
        for (letrasCorretasModel caracter : palavraModel.getLetras()) {            
            EnumStatus status = EnumStatus.ERRADO;
            if (palavra.contains(String.valueOf(caracter.getLetra().toLowerCase()))) {
                status = EnumStatus.EXISTE;
                if (palavra.charAt(posicao) == caracter.getLetra().toLowerCase().charAt(0)) {
                    status = EnumStatus.CORRETO;
                }
            }
            caracter.setStatus(status);
            posicao +=1;
        }
        palavraModel.setAtivo(false);
        return palavraModel;

    }
    public boolean ExisteBanco(MapaPalavraModel palavraModel) {
        String palavraDefinida = "";
        for(var caracter : palavraModel.getLetras()){
            palavraDefinida += caracter.getLetra().toLowerCase();
        }
        List<String> listaPalavras = leitor.ler();        

        return listaPalavras.contains(palavraDefinida);

    }
     public boolean vitoria(MapaPalavraModel palavraModel) {
        boolean fim = true;
        for(var caracter : palavraModel.getLetras()){
            fim = caracter.getStatus() == EnumStatus.CORRETO;
            if(fim == false){
                break;
            }            
        }         

        return fim;
    }
}
