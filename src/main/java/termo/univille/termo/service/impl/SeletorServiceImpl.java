package termo.univille.termo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import termo.univille.termo.service.contratos.SeletorService;
import termo.univille.termo.Helpers.ConsultasPalavra;
import termo.univille.termo.model.FormulariosModel;
import termo.univille.termo.model.MapaPalavraModel;
import termo.univille.termo.model.letrasCorretasModel;

@Service
public class SeletorServiceImpl implements SeletorService {

    @Autowired
    private termo.univille.termo.ConsultaTexto.contratos.leitor leitor;

    @Override
    public FormulariosModel RequisicaoInicial() {
        List<String> listaPalavras = leitor.ler();

        if (listaPalavras.isEmpty()) {
            return new FormulariosModel();
        } else {
            Random random = new Random();
            int indiceAleatorio = random.nextInt(listaPalavras.size());
            FormulariosModel forms = new FormulariosModel();
            MapaPalavraModel palavra1 = new MapaPalavraModel();
            palavra1.setAtivo(true);
            forms.setPalavraChave(listaPalavras.get(indiceAleatorio));
            forms.setLinha1(palavra1);
            return forms;
        }
    }

    @Override
    public List<letrasCorretasModel> checarpalavra(String palavra, String palavraJogador) {

        List<letrasCorretasModel> listacorreta = new ArrayList<>();

        for (int i = 0; i < palavraJogador.length(); i++) {
            char letra = palavraJogador.charAt(i);
            listacorreta.add(ConsultasPalavra.verificarLetra(palavra, letra, i));
        }
        return listacorreta;
    }

}
