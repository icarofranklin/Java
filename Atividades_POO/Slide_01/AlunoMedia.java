package Slide_01;
import java.util.Scanner; 
//importa a classe Scanner para leitura de dados

public class AlunoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        //1 - Cria um objeto Scanner para ler dados do teclado

        System.out.print("Digite a primeiro nota: ");
        //2 - Solicita ao usuário que digite a primeira nota
        double nota1 = leitor.nextDouble(); 
        //3 - Lê a primeira nota como um número de ponto flutuante

        System.out.print("Digite a segunda nota: ");
        //2 - Solicita ao usuário que digite a segunda nota
        double nota2 = leitor.nextDouble(); 
        //4 - Lê a segunda nota como um número de ponto flutuante

        double media = (nota1 + nota2) / 2; 
        //5 - Calcula a média das duas notas

        System.out.println("A média do aluno é: " + media);
        //6 - Exibe a média calculada

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
        // Exibe se o aluno foi aprovado ou reprovado com base na média

        leitor.close(); 
        //7 - Fecha o leitor para liberar recursos(boa prática)
    }
}
// o que é ponto flutuante? um ponto flutuante (ou "float") é um tipo de dado usado para representar números reais na computação, permitindo valores com casas decimais e uma grande variedade de magnitudes, como 2,5 ou -3,14159.