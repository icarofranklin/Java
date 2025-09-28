package Slide_01;
import java.util.Scanner;
//importa a classe Scanner para leitura de dados
public class ConversorHora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Cria o leitor de teclado

        System.out.print("Digite a hora (apenas números): ");
        int hora = leitor.nextInt();
        // Lê a hora
        System.out.print("Digite os minutos (apenas números): ");
        int minutos = leitor.nextInt();
        // Lê os minutos
        int totalMinutos = (hora * 60) + minutos;
        // Converte tudo para minutos
        int totalSegundos = totalMinutos * 60;
        // Converte tudo para segundos
        System.out.println("\nResultados:"); 
        // Exibe a string resultados + quebra de linha
        System.out.println("O tempo digitado equivale a: " + totalMinutos + " minutos."); 
        // Exibe o total em minutos 
        System.out.println("O tempo digitado equivale a: " + totalSegundos + " segundos.");
        // Exibe o total em segundos
        leitor.close();
        // Fecha o leitor para liberar memória (boa prática)
    }
}