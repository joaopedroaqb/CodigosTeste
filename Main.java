import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class CarrinhoDeCompras {
    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        System.out.println("Produtos no carrinho de compras:");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Supermercado");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Remover produto do carrinho");
            System.out.println("3. Listar produtos do carrinho");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.next();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(nome, preco);
                    carrinho.adicionarProduto(produto);
                    System.out.println("Produto adicionado ao carrinho!");
                    break;

                case 2:
                    System.out.print("Digite o nome do produto a ser removido: ");
                    nome = scanner.next();
                    Produto produtoRemover = null;
                    for (Produto p : carrinho.getProdutos()) {
                        if (p.getNome().equalsIgnoreCase(nome)) {
                            produtoRemover = p;
                            break;
                        }
                    }
                    if (produtoRemover != null) {
                        carrinho.removerProduto(produtoRemover);
                        System.out.println("Produto removido do carrinho!");
                    } else {
                        System.out.println("Produto não encontrado no carrinho!");
                    }
                    break;

                case 3:
                    carrinho.listarProdutos();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

