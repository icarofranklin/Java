import java.security.SecureRandom;

public class aula8 { //matrizes são arrays dentro de outros arrays
    public static void main(String[] args) {
        
        final int linhas= 3;
        final int colunas= 5;
        int [][] numeros = new int[linhas][colunas];

        //[0,1,2,3,4,5], [0,1,2,3,4,5], [0,1,2,3,4,5]

        for(int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                numeros[1][c]= new SecureRandom().nextInt(100); 
            }
        }

        for(int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                System.out.printf("%2d | ",numeros[1][c]);
            }
            System.out.printf("%n");
        }

    }
}
