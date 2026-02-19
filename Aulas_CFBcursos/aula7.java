import java.util.Arrays;

public class aula7 {
    public static void main(String[] args) {

        final int tam=10;
        int[] num={9,2,7,1,2,8,5,3,4,0,6}; // array de inteiros representando uma sequência de números
        int[] numeros=new int[tam];
        int p=3;
        int pos;

        /*
        - Arrays.sort(numeros); Metodo de ordenação Sort

        - Arrays.fill(numeros, tam); Preenche os valores de um array

        - System.arraycopy(num, 0, numeros, 0, tam); Copia o que tem dentro de um Array e coloca em outro
        Seguindo a ordem de {scr, srcPos, dest, destPos, length}

        - System.out.printf("Arrays são iguais:%s", Arrays.equals(num, numeros) ? "Sim" : "Nao"); Faz uma comparação para ver se são iguais

        */
        Arrays.sort(num);
        pos = Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d está no array? %s na posicao %d",p, pos  > 0 ? "Sim " : "Nao ", pos);

        /*for(int n:numeros){ 
            System.out.printf("%d - " ,n);
        }*/
    }
}

    /*
        for(int i=0; i < num.length; i++){
            System.out.printf("%d - ", num[i]);
        }
        "For" Tradicional (O Controlador):
            - Você tem controle total. Se quiser ler o array de trás para frente, ou pular de 2 em 2, ou alterar o valor que está dentro da gaveta, você consegue.
            - Use o For Tradicional (com i) quando você precisa saber em qual posição do array você está, ou quando precisa modificar os valores do array original (ex: num[i] = 10;).
---
        for(int n:num){ 
            System.out.printf("%d - " ,n);
        }    
        For-Each(Para cada) ou Enchanced For(For melhorado)
            - O código fica muito mais limpo, fácil de ler e elimina o risco de você errar o tamanho do array
            - Use o For-Each (com n : num) quando você só quer ler ou imprimir todos os valores, do primeiro ao último, sem se importar com a posição deles.
    */