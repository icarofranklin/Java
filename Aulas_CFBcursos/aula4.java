import java.util.Scanner;

public class aula4 {
    public static void main(String[] args) { //Utilização de Scanner

        Scanner scan = new Scanner (System.in);
        
        int n1, n2, n3, n4, soma;
        final int MEDIA=60; // "final" indica que é uma constante
        String nome, res;

        System.out.println("Digite o nome do aluno: ");
        nome=scan.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1=scan.nextInt();
        System.out.println("Digite digite a segunda nota: ");
        n2=scan.nextInt();
        System.out.println("Digite digite a terceira nota: ");
        n3=scan.nextInt();
        System.out.println("Digite digite a quarta nota: ");
        n4=scan.nextInt();
        soma=n1+n2+n3+n4;
        if (soma >= 60) {
            res="Aprovado";
        } else if (soma >= 40){
            res="Recuperação";
        } else {
            res="Reprovado";
        }
        System.out.printf("Aluno %s, foi %s com a nota %d", nome, res, soma);
        // %d é um placeholder (espaço reservado) para números inteiros
        // %s é um placeholder (espaço reservado) para strings (textos)
        System.err.println(""); // Pula uma linha
        scan.close();
    }    
}
