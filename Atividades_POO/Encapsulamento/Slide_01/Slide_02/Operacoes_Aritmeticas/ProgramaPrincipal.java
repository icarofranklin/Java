package Operacoes_Aritmeticas;
import  java.util.Scanner;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)){

            // Coleta de dados
            System.out.print("Digite o primeiro número inteiro: ");
            int n1 = leitor.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int n2 = leitor.nextInt();

            System.out.print("Digite a operação (+, -, *, /): ");
            /* leitor.next() lê a próxima String digitada
            .charAt (0) pega o primeiro caractere dessa String.*/
            char op = leitor.next().charAt(0);

            // Processamento e saída
            try {
                // Criando o objeto especialista, entregando os dados a ele.
                Calculadora calc = new Calculadora(n1, n2, op);

                // Pedindo ao objeto para fazer a conta.
                double resultado = calc.executarOperacao();

                // Se tudo ocorrer bem, mostra o resultado.
                System.out.println("Resultado: " + resultado);
                
            } catch (IllegalArgumentException e) {
                /* Se der algum erro, mostramos a mensagem de erro.
                e.getMessage() pega a mensagem de erro que definimos na classe calculadora.java*/
                System.out.println(e.getMessage());
            }
        }
    }
}
