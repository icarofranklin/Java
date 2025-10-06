public class ControleEstoque {
    public static void main(String[] args) {
        // Criando um novo produto
        Produto produto1 = new Produto("RaspBerryPi", 10);
        produto1.exibirInformacoes();

        // Adicionando produtos ao estoque
        produto1.adicionarEstoque(5);
        produto1.exibirInformacoes();

        // Tentando adicionar uma quantidade negativa (inválido)
        produto1.adicionarEstoque(-2);
        produto1.exibirInformacoes();

        // Removendo produtos do estoque
        produto1.removerEstoque(7);
        produto1.exibirInformacoes();

        // Tentando remover mais produtos do que o disponível em estoque (inválido)
        produto1.removerEstoque(15);
        produto1.exibirInformacoes();

        // Tentando remover uma quantidade negativa (inválido)
        produto1.removerEstoque(-3);
        produto1.exibirInformacoes();

        // Removendo o restante do estoque
        produto1.removerEstoque(8);
        produto1.exibirInformacoes();
    }
}