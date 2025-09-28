import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {
    System.out.println("Digite um número inteiro:");
        try (Scanner scanner = new Scanner(System.in)) { // Cria um objeto Scanner para ler a entrada do usuário
        // fecha automaticamente o scanner
            int numero = scanner.nextInt();
            if (numero % 2 == 0) { // O número é dividido por 2 e o resto tem que ser igual a 0
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }   }
    }
}
