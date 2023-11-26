package termo.univille.termo.service.impl;

import java.util.Base64;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import termo.univille.termo.service.contratos.SeletorService;
import termo.univille.termo.Enums.EnumFinalizar;
import termo.univille.termo.Helpers.IConsultasPalavra;
import termo.univille.termo.model.FormulariosModel;
import termo.univille.termo.model.MapaPalavraModel;

@Service
public class SeletorServiceImpl implements SeletorService {

    @Autowired
    private termo.univille.termo.ConsultaTexto.contratos.leitor leitor;

    @Autowired
    private IConsultasPalavra helper;

    @Override
    public FormulariosModel RequisicaoInicial() {
        List<String> listaPalavras = leitor.ler();

        if (listaPalavras.isEmpty()) {
            return new FormulariosModel();
        } else {
            Random random = new Random();
            int indiceAleatorio = random.nextInt(listaPalavras.size());
            FormulariosModel forms = new FormulariosModel();
            List<MapaPalavraModel> palavras = forms.getLinhas();
            palavras.get(0).setAtivo(true);
            String palavraChaveBase64 = Base64.getEncoder()
                    .encodeToString(listaPalavras.get(indiceAleatorio).getBytes());
            forms.setPalavraChave(palavraChaveBase64);
            forms.setLinhas(palavras);
            return forms;
        }
    }

    @Override
    public FormulariosModel checarpalavra(FormulariosModel formulario) {
        try {
            byte[] palavraChaveBytes = Base64.getDecoder().decode(formulario.getPalavraChave());
            String palavraChave = new String(palavraChaveBytes);

            var linhasFormulario = formulario.getLinhas();

            var tamanhoLista = linhasFormulario.size();

            for (int i = 0; i < tamanhoLista; i++) {
                var palavra = linhasFormulario.get(i);
                if (palavra.isAtivo()) {
                    if (!helper.ExisteBanco(palavra)) {
                        throw new RuntimeException("Essa palavra não é aceita");
                    }
                    var palavarachecada = helper.verificarLetras(palavraChave, palavra);
                    if (helper.vitoria(palavarachecada)) {
                        formulario.setFimJogo(EnumFinalizar.GANHO);
                        formulario.setMensagem("Vitória");
                        formulario.setPalavraChave(palavraChave);
                    }
                    palavra.setLetras(palavarachecada.getLetras());
                    linhasFormulario.set(i, palavra);

                    if (i < tamanhoLista - 1 && formulario.getFimJogo() != EnumFinalizar.GANHO) {
                        var proximaPalavra = linhasFormulario.get(i + 1);
                        proximaPalavra.setAtivo(true);
                        linhasFormulario.set(i + 1, proximaPalavra);

                        break;
                    } else {
                        if (formulario.getFimJogo() != EnumFinalizar.GANHO) {
                            formulario.setFimJogo(EnumFinalizar.PERDA);
                            formulario.setMensagem("Perdeu");
                            formulario.setPalavraChave(palavraChave);

                        }
                    }
                    formulario.setLinhas(linhasFormulario);
                }
            }
            return formulario;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

}
