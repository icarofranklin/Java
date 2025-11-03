public class Produto {
    private String nome;
    private int quantidadeEstoque;

    public Produto(String nome, int quantidadeEstoqueInicial) {
        this.nome = nome;
        if (quantidadeEstoqueInicial >= 0) {
            this.quantidadeEstoque = quantidadeEstoqueInicial;
        } else {
            this.quantidadeEstoque = 0;
            System.out.println("A quantidade inicial em estoque não pode ser negativa. O estoque foi iniciado com 0.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidade(s) do produto '" + nome + "' foram adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0) {
            if (this.quantidadeEstoque >= quantidade) {
                this.quantidadeEstoque -= quantidade;
                System.out.println(quantidade + " unidade(s) do produto '" + nome + "' foram removidas do estoque.");
            } else {
                System.out.println("Não há estoque suficiente do produto '" + nome + "' para remover a quantidade solicitada.");
            }
        } else {
            System.out.println("A quantidade a ser removida deve ser positiva.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n--- Informações do Produto ---");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("----------------------------\n");
    }
}