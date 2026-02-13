import java.util.Scanner;

public class aula6Exer {
    public static void main(String[] args) {
        final int tam=5; // constante para definir o tamanho dos arrays

        char[] gabarito={'a','a','d','b','c'}; // array de caracteres representando o gabarito de uma prova
        char[] respostas=new char[tam]; // array de caracteres representando as respostas de um aluno
        int nota=0; // variável para armazenar a nota do aluno
        Scanner scan=new Scanner(System.in); // objeto Scanner para ler a entrada do usuário

        respostas[0]='a'; // atribuindo resposta ao primeiro elemento do array (índice 0)
        respostas[1]='b'; // atribuindo resposta ao segundo elemento do array (índice 1)
        respostas[2]='c'; // atribuindo resposta ao terceiro elemento do array (índice 2)
        respostas[3]='b'; // atribuindo resposta ao quarto elemento do array (índice 3)
        respostas[4]='c'; // atribuindo resposta ao quinto elemento do array (índice 4)

        for(int i=0;i<tam;i++){
            System.out.printf("Informe o número da nota do aluno na questão %d: ", i);
            respostas[i]=scan.nextLine().charAt(0); // lendo a resposta do aluno para cada questão e armazenando no array de respostas
        }

        for(int i=0;i<tam;i++){
            if(respostas[i]==gabarito[i]){ // comparando a resposta do aluno com o gabarito
                nota++; // incrementando a nota do aluno se a resposta estiver correta
            }
        }
        System.out.printf("%nNota do aluno:%d\n", nota); // imprimindo a nota do aluno, que é o número de respostas corretas
    }
}
