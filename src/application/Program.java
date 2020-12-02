package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        String[] lines = new String[] { "Teste de Escrita de texto em arquivo "};

        String path = "/home/octogorsen/Documentos/testegpas/out.txt1";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // cria o arquivo do caminho
            // path e insere o texto ; append:true não deixa recriar o arquivo
            // só faz uma nova inserção de linha no texto a cada vez que o programa é executado.
            for (String line : lines){
                bw.write(line);
                bw.newLine();
               }
            }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
