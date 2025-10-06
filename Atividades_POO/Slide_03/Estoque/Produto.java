// ARQUIVO: Produto.java
public class Produto {
    private String nomeDoProduto;
    private int quantidadeEmEstoque;

    // Construtor: Cria o objeto com os dados iniciais.
    public Produto(String nomeDoProduto, int quantidadeEmEstoque) {
        this.nomeDoProduto = nomeDoProduto;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Adiciona uma quantidade ao estoque.
    public void adicionarProduto(int quantidade) {
        if (quantidade > 0) { // Uma pequena validação extra
            this.quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades de '" + this.nomeDoProduto + "' adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    // Remove uma quantidade do estoque, se possível.
    public void removerProduto(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade a ser removida deve ser positiva.");
            return;
        }
        
        if (quantidade > this.quantidadeEmEstoque) {
            System.out.println("Falha na remoção: Quantidade insuficiente em estoque.");
        } else {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de '" + this.nomeDoProduto + "' removidas do estoque.");
        }
    }
    
    // MÉTODO NOVO: Exibe o estado atual do produto.
    public void exibirInformacoes() {
        System.out.println("------------------------------------");
        System.out.println("Produto: " + this.nomeDoProduto);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEmEstoque);
        System.out.println("------------------------------------");
    }
}