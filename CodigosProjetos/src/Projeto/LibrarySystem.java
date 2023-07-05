package Projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void pesquisarLivro(String termoPesquisa) {
        List<Livro> resultados = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(termoPesquisa.toLowerCase()) ||
                livro.getAutor().toLowerCase().contains(termoPesquisa.toLowerCase())) {
                resultados.add(livro);
            }
        }

        if (resultados.isEmpty()) {
            System.out.println("Nenhum livro encontrado com o termo de pesquisa: " + termoPesquisa);
        } else {
            System.out.println("Resultados da pesquisa para: " + termoPesquisa);
            for (Livro livro : resultados) {
                System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
            }
        }
    }

    public void exibirLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca não possui livros cadastrados.");
        } else {
            System.out.println("Lista de Livros na Biblioteca:");
            for (Livro livro : livros) {
                System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        boolean executando = true;

        while (executando) {
            System.out.println("=== Sistema de Biblioteca ===");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Pesquisar Livro");
            System.out.println("3. Exibir Livros");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();

                    Livro livro = new Livro(titulo, autor);
                    biblioteca.adicionarLivro(livro);

                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite um termo de pesquisa: ");
                    String termoPesquisa = scanner.nextLine();

                    biblioteca.pesquisarLivro(termoPesquisa);
                    break;

                case 3:
                    biblioteca.exibirLivros();
                    break;

                case 4:
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        }

        System.out.println("Encerrando o programa. Obrigado por usar o Sistema de Biblioteca!");
        scanner.close();
    }
}
