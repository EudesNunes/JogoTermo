package termo.univille.termo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import termo.univille.termo.service.contratos.SeletorService;
import termo.univille.termo.Helpers.ConsultasPalavra;
import termo.univille.termo.model.letrasCorretasModel;

@Service
public class SeletorServiceImpl implements SeletorService {

    @Autowired
    private termo.univille.termo.ConsultaTexto.contratos.leitor leitor;

    @Override
    public String palavraSelecionada() {
        List<String> listaPalavras = leitor.ler();

        if (listaPalavras.isEmpty()) {
            return "";
        } else {
            Random random = new Random();
            int indiceAleatorio = random.nextInt(listaPalavras.size());
            return listaPalavras.get(indiceAleatorio);
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
