# Sistema de Biblioteca

## Como executar

### Opção 1 — JAR executável (mais fácil)
```bash
java -jar biblioteca.jar
```

### Opção 2 — Compilar do zero
```bash
# Compilar
javac -d out -sourcepath src src/biblioteca/BibliotecaApp.java

# Executar
java -cp out biblioteca.BibliotecaApp

# Gerar JAR
jar cfe biblioteca.jar biblioteca.BibliotecaApp -C out .
```

## Estrutura do projeto
```
src/biblioteca/
├── BibliotecaApp.java     ← JFrame principal (main aqui)
├── Livro.java
├── lista/
│   ├── NoLista.java
│   └── ListaLivros.java
├── arvore/
│   ├── NoArvore.java
│   └── ArvoreLivros.java
├── fila/
│   ├── NoFila.java
│   └── FilaReserva.java
└── persistencia/
    └── Persistencia.java
```

## Funcionalidades
- ＋ Adicionar livro
- ✕ Remover livro (selecione na tabela)
- ↓ Emprestar livro (selecione na tabela)
- ↑ Devolver livro (selecione na tabela)
- 🔍 Buscar por título via BST
- 🌲 Listar todos ordenados alfabeticamente (BST In-Ordem)
- ⏳ Fila de reservas com enqueue/dequeue
- 💾 Salvar/carregar de livros.txt

## Requisitos
- Java 11+
