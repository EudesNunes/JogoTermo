package termo.univille.termo.model;

import java.util.List;

public class FormulariosModel {
    private MapaPalavraModel Linha1;
    private MapaPalavraModel Linha2;
    private MapaPalavraModel Linha3;
    private MapaPalavraModel Linha4;
    private MapaPalavraModel Linha5;
    private MapaPalavraModel Linha6;

    private String PalavraChave;

    public FormulariosModel() {
        this.Linha1 = new MapaPalavraModel();
        this.Linha2 = new MapaPalavraModel();
        this.Linha3 = new MapaPalavraModel();
        this.Linha4 = new MapaPalavraModel();
        this.Linha5 = new MapaPalavraModel();
        this.Linha6 = new MapaPalavraModel();

        this.PalavraChave = "";
    }

    public MapaPalavraModel getLinha6() {
        return Linha6;
    }

    public void setLinha6(MapaPalavraModel linha6) {
        Linha6 = linha6;
    }

    public String getPalavraChave() {
        return PalavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        PalavraChave = palavraChave;
    }

    public MapaPalavraModel getLinha1() {
        return Linha1;
    }

    public void setLinha1(MapaPalavraModel linha1) {
        Linha1 = linha1;
    }

    public MapaPalavraModel getLinha2() {
        return Linha2;
    }

    public void setLinha2(MapaPalavraModel linha2) {
        Linha2 = linha2;
    }

    public MapaPalavraModel getLinha3() {
        return Linha3;
    }

    public void setLinha3(MapaPalavraModel linha3) {
        Linha3 = linha3;
    }

    public MapaPalavraModel getLinha4() {
        return Linha4;
    }

    public void setLinha4(MapaPalavraModel linha4) {
        Linha4 = linha4;
    }

    public MapaPalavraModel getLinha5() {
        return Linha5;
    }

    public void setLinha5(MapaPalavraModel linha5) {
        Linha5 = linha5;
    }

}
