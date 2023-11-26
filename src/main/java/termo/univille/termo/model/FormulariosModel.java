package termo.univille.termo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import termo.univille.termo.Enums.EnumFinalizar;

public class FormulariosModel {
    private List<MapaPalavraModel> Linhas;

    private String PalavraChave;

    private EnumFinalizar FimJogo;

    private String Mensagem;

    public FormulariosModel() {
        this.Linhas = new ArrayList<>(Arrays.asList(new MapaPalavraModel(),
                new MapaPalavraModel(),
                new MapaPalavraModel(),
                new MapaPalavraModel(), 
                new MapaPalavraModel(),
                new MapaPalavraModel()));

        this.PalavraChave = ""; 
        this.Mensagem = "";
        this.FimJogo = EnumFinalizar.NULO;

    }

    
    public String getPalavraChave() {
        return PalavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        PalavraChave = palavraChave;
    }

    public List<MapaPalavraModel> getLinhas() {
        return Linhas;
    }

    public void setLinhas(List<MapaPalavraModel> linhas) {
        Linhas = linhas;
    }  

    public EnumFinalizar getFimJogo() {
        return FimJogo;
    }


    public void setFimJogo(EnumFinalizar fimJogo) {
        FimJogo = fimJogo;
    }


    public String getMensagem() {
        return Mensagem;
    }


    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }

}
