import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args){
    double altura;
    double peso;
    double imc;
        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Digite seu peso em kg: ");
            peso = scanner.nextDouble();

            System.out.print("Digite seu altura em metros(coloque a virgula): ");
            altura = scanner.nextDouble();
            imc = peso / (altura * altura);
            System.out.printf("Seu IMC é: %.2f\n", imc);
           if (imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 24.9) {
                // Se chegou aqui, já sabemos que imc >= 18.5
                System.out.println("Peso normal");
            } else if (imc <= 29.9) {
                // Se chegou aqui, já sabemos que imc > 24.9
                System.out.println("Sobrepeso");
            } else {
                // Se não se encaixou em nenhuma das anteriores, só pode ser >= 30.0
                System.out.println("Obesidade");
            }
        }
    }
}
