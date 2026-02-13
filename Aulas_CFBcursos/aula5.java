import java.util.Scanner;

public class aula5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Estruturas de Repetição - FOR, WHILE e DO WHILE

        /*FOR é como se fosse uma parada de ônibus, onde você tem um ponto de partida, um destino e um número de paradas.
            for(int cont=0; cont < 12; cont++){ 
            System.out.println(cont + " - Ícaro Franklin");
            }
            cont++ é o mesmo que: 
            - cont + 1 
            - cont += 1
            É bom executar ele quando você sabe a quantidade de repetições que o bloco de código deve ser executado.
        */

        /*WHILE - Usado quando não sabemos o número de repetições exatas, mas sabemos a condição de parada.
            System.out.println("Digite um número máximo: ");
            int max = scan.nextInt();
            int cont = 0; //inicialização
            while(cont < max){ //condição
                System.out.println(cont + " - Ícaro Franklin");
                cont++; //incremento 
        */
                
        //DO WHILE - usado quando não sabemos o número de repetições, mas queremos que o bloco seja executado pelo menos uma vez
            int cont = 0; //inicialização
            do { 
                System.out.println(cont + " - Ícaro Franklin");
                cont++; //incremento
            } while (cont < 6); //condição
        System.out.println("Fim do Programa");
    }
}
