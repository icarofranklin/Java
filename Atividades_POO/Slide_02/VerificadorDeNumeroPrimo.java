import java.util.Scanner;

public class VerificadorDeNumeroPrimo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;

            System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();

            // Variável para indicar se o número é primo ou não
            boolean ehPrimo = true;

            // Números 0 e 1 não são primos
            if (numero <= 1) {
                ehPrimo = false;
            } else {
                // Verifica divisores de 2 até a raiz quadrada do número
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    // Se o número for divisível por algum outro número além de 1 e ele mesmo
                    if (numero % i == 0) {
                        ehPrimo = false; // Não é primo
                        break;           // Interrompe o loop, pois já sabemos que não é primo
                    }
                }
            }

            // Imprime o resultado final
            if (ehPrimo) {
                System.out.println(numero + " -> É primo");
            } else {
                System.out.println(numero + " -> Não é primo");
            }

            scanner.close();
        }
    }
}