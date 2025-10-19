import java.util.Scanner;
public class aula5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*FOR
        for(int cont=0; cont < 12; cont++){ 
        //cont++ é o mesmo que cont = cont + 1 ou cont += 1
        System.out.println(cont + " - Ícaro Franklin");*/

        //WHILE - usado quando não sabemos o número de repetições
            System.out.println("Digite um número máximo: ");
            int max = scan.nextInt();
            int cont = 0; //inicialização
            while(cont < max){//condição
                System.out.println(cont + " - Ícaro Franklin");
                cont++; //incremento
            }
        System.out.println("Fim do Programa");
    }
}
