import java.util.Scanner; 

public class URA { // Menu de Atendimento Interativo
    // Uso de Switch-Case
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)){
            int opcao; // Variável para armazenar a opção escolhida pelo usuário
            // Loop para exibir o menu até que o usuário escolha sair
            do {
                //exibir o menu de opções
                System.out.println("\n Seja bem-vindo ao atendimento automático da empresa VitalMen!");
                System.out.println("Escolha uma das opções abaixo:");
                System.out.println("1 - Agendar consulta");
                System.out.println("3 - Informações sobre planos de saúde");
                System.out.println("2 - Falar com um atendente");
                System.out.println("4 - Fazer reclamação");
                System.out.print("Digite a opção desejada (ou 0 para sair): ");

                opcao = leitor.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) { // Break automático com a sintaxe do Java 14+, isso ajuda a não ter que colocar o break em cada case
                case 1 -> System.out.println("Você escolheu agendar uma consulta. Por favor, aguarde enquanto conectamos você a um atendente.");
                case 2 -> System.out.println("Você escolheu falar com um atendente. Por favor, aguarde enquanto conectamos você a um atendente.");
                case 3 -> System.out.println("Você escolheu informações sobre planos de saúde. Por favor, aguarde enquanto conectamos você a um atendente.");
                case 4 -> System.out.println("Você escolheu fazer uma reclamação. Por favor, aguarde enquanto conectamos você a um atendente.");
                case 0 -> System.out.println("Obrigado por usar nosso serviço de atendimento automático. Até logo!");
                default -> System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0); // Continua exibindo o menu até que o usuário escolha sair
    }
}

    @Override
    public String toString() { // Agora, quando o objeto for impresso, ele retornará este texto formatado.
        return "URA []";
    }
    
        //Use switch-case quando: Você tem uma única variável (um número, um caractere ou uma String) e precisa executar ações diferentes para vários valores exatos e conhecidos dessa variável.
    }