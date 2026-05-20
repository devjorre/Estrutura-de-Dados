package persistencia;

import java.io.*;
import java.util.Scanner;
import lista.*;
import modelo.Livro;


public class Persistencia {

    private static final String FILE_NAME = "livros.txt";

    public static void salvar(ListaLivros lista) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            NoLista atual = lista.getInicio();
            while(atual != null) {
                Livro l = atual.livro;
                writer.write(l.getId() + ";" + l.getTitulo() + ";" + l.getAutor() + ";" + l.isDisponivel() + "\n");
                atual = atual.proximo;
            }
        }
    }

    public static void carregar(ListaLivros lista) {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split(";");
                if (partes.length >= 3) {
                    int id = Integer.parseInt(partes[0]);
                    String titulo = partes[1];
                    String autor = partes[2];
                    Livro l = new Livro(id, titulo, autor);
                    if (partes.length == 4 && partes[3].equals("false")) {
                        l.emprestar();
                    }
                    lista.inserir(l);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }
}
