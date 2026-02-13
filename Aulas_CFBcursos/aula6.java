public class aula6 {
    public static void main(String[] args) {
        /* arrays em Java
        O que é um array? É uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo, organizados em uma sequência.

        Porque usar um array? Para armazenar e manipular grandes quantidades de dados de forma eficiente, sem precisar criar uma variável para cada elemento.

        Como declarar um array?
        tipo[] nomeDoArray = new tipo[tamanho];
        */ 
        final int TAMANHO = 5; // constante para definir o tamanho do array

        int[] num=new int[TAMANHO]; // declaração e criação de um array de inteiros com 5 elementos
        int[] numeros={10, 20, 30, 40, 50}; // declaração e criação de um array de inteiros com inicialização

        /*
        num[0]=10; // atribuindo valor ao primeiro elemento do array (índice 0)
        num[1]=5; // atribuindo valor ao segundo elemento do array (índice 1)
        num[2]=15; // atribuindo valor ao terceiro elemento do array (índice 2)
        num[3]=0; // atribuindo valor ao quarto elemento do array (índice 3)
        num[4]=8; // atribuindo valor ao quinto elemento do array (índice 4)
        */

        for(int i=0;i<numeros.length;i++){
            System.out.printf("%d -" ,numeros[i]);
        }
    }
}
