// ARQUIVO: ProgramaPrincipal.java
public class ProdutoEstoque {
    public static void main(String[] args) {

        System.out.println("Criando um novo produto no sistema...");
        Produto p1 = new Produto("Cartas de Yu-Gi-Oh!", 50);

        p1.exibirInformacoes();

        System.out.println("\n>>> Simulando ações de um vendedor...\n");

        System.out.println("Ação: Chegou um novo lote com 25 unidades.");
        p1.adicionarProduto(25);
        p1.exibirInformacoes();

        System.out.println("Ação: Um cliente comprou 10 unidades.");
        p1.removerProduto(10);
        p1.exibirInformacoes();
        
        System.out.println("Ação: Outro cliente tentou comprar 80 unidades.");
        p1.removerProduto(80);
        p1.exibirInformacoes();
    }
}