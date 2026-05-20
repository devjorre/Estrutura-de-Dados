package lista;

import modelo.Livro;



public class ListaLivros {

    private NoLista inicio;

    public void inserir(Livro livro) {
        NoLista novo = new NoLista(livro);
        novo.proximo = inicio;
        inicio = novo;
    }

    public Livro buscar(int id) {
        NoLista atual = inicio;
        while(atual != null) {
            if(atual.livro.getId() == id) {
                return atual.livro;
            }
            atual = atual.proximo;
        }
        return null;
    }

    public void remover(int id) {
        if(inicio == null)
            return;

        if(inicio.livro.getId() == id) {
            inicio = inicio.proximo;
            return;
        }

        NoLista atual = inicio;
        while(atual.proximo != null) {
            if(atual.proximo.livro.getId() == id) {
                atual.proximo = atual.proximo.proximo;
                return;
            }
            atual = atual.proximo;
        }
    }

    public void listar() {
        NoLista atual = inicio;
        if (atual == null) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        while(atual != null) {
            System.out.println(atual.livro);
            atual = atual.proximo;
        }
    }

    public NoLista getInicio() {
        return inicio;
    }
}
