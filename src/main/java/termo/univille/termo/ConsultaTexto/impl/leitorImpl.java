package termo.univille.termo.ConsultaTexto.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import termo.univille.termo.ConsultaTexto.contratos.leitor;

@Repository
public class leitorImpl implements leitor {

    @Override
    public List<String> ler() {
        String filePath = "src/main/resources/static/txt/br-utf8.txt";
        List<String> linhas = new ArrayList<>();
        
        try {
            linhas = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return linhas;
    }

}
