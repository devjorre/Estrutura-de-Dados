package dupla;

import modelo.Livro;

public class ListaDupla {

    private NoDuplo inicio;
    private NoDuplo fim;

    public void inserirFim(Livro livro) {
        NoDuplo novo = new NoDuplo(livro);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public Livro buscarPorTitulo(String titulo) {
        NoDuplo atual = inicio;
        while (atual != null) {
            if (atual.livro.getTitulo().equalsIgnoreCase(titulo)) {
                return atual.livro;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void listarOrdemDireta() {
        NoDuplo atual = inicio;
        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }
        while (atual != null) {
            System.out.println(atual.livro.getTitulo());
            atual = atual.proximo;
        }
    }

    public void listarOrdemInversa() {
        NoDuplo atual = fim;
        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }
        while (atual != null) {
            System.out.println(atual.livro.getTitulo());
            atual = atual.anterior;
        }
    }

    public void limpar() {
        inicio = null;
        fim = null;
    }
}
