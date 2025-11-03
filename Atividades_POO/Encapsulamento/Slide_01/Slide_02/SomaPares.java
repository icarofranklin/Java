public class SomaPares {

    public static void main(String[] args) {
        int soma = 0;

        // Loop que percorre os números de 1 a 100
        for (int i = 1; i <= 100; i++) {
            // Verifica se o número é par
            if (i % 2 == 0) {
                // Se for par, adiciona à variável 'soma'
                soma += i;
            }
        }

        // Imprime o resultado final da soma
        System.out.println("A soma de todos os números pares entre 1 e 100 é: " + soma);
    }
}