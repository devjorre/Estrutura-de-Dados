package dupla;

import modelo.Livro;

public class NoDuplo {

    public Livro livro;
    public NoDuplo proximo;
    public NoDuplo anterior;

    public NoDuplo(Livro livro) {
        this.livro = livro;
    }
}
