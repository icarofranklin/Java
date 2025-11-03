import java.util.Scanner;

public class MaiorMenorValor {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Cria um array para armazenar os 10 números
            int[] numeros = new int[10];

            // Solicita ao usuário que insira os 10 números
            System.out.println("Digite 10 números inteiros:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Inicializa as variáveis 'maior' e 'menor' com o primeiro valor do array.
            int maior = numeros[0];
            int menor = numeros[0];

            // Percorre o array a partir do segundo elemento (posição 1)
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i]; 
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            // Imprime os resultados
            System.out.println("\nO maior valor digitado foi: " + maior);
            System.out.println("O menor valor digitado foi: " + menor);

            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}