import java.util.Scanner;

public class ContadorDeNumeros {

    public static void main(String[] args) {

        try (// Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in)) {
            // Cria um array para armazenar os 10 números
            int[] numeros = new int[10];

            // Solicita ao usuário que insira os 10 números
            System.out.println("Digite 10 números inteiros:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Solicita o número específico a ser procurado
            System.out.print("\nDigite o número inteiro que você deseja contar: ");
            int numeroEspecifico = scanner.nextInt();

            // Variável para contar as ocorrências
            int contagem = 0;

            // Percorre o array para contar as ocorrências do número específico
            for (int i = 0; i < 10; i++) {
                if (numeros[i] == numeroEspecifico) {
                    contagem++; // Incrementa o contador se o número for encontrado
                }
            }

            // Imprime o resultado final
            System.out.println("\nO número " + numeroEspecifico + " apareceu " + contagem + " vez(es).");

            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}