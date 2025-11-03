
import java.util.Scanner;

public class CalculadoraDiagonais {
    public static void main(String[] args) {
        // --- ENTRADA ---
        try (Scanner leitor = new Scanner(System.in) // no próximo código eu tento usar o try-with-resources.
        ) {
            // --- ENTRADA ---
            System.out.print("Digite o número de lados do polígono convexo: ");
            int ladosInformados = leitor.nextInt();
            /* PROCESSAMENTO
            1. Criamos um OBJETO (uma instância) a partir do nosso molde Poligono.
            A partir daqui, 'meuPoligono' é uma entidade que tem seus próprios dados e comportamentos, que foram configurados no objeto*/
            Poligono meuPoligono = new Poligono(ladosInformados);
            /* 2. Usamos o método do objeto para calcular o número de diagonais.
            O objeto "sabe" como fazer esse cálculo, então delegamos essa responsabilidade a ele.*/
            int resultadoDiagonais = meuPoligono.calcularNumeroDeDiagonais();
            /*--- SAÍDA ---
            Usamos o método getter para exibir o número de lados de forma segura.*/
            System.out.println("Um polígono com " + meuPoligono.getNumeroDeLados() + " lados tem " + resultadoDiagonais + " diagonais.");
            // Fecha o leitor para liberar memória (boa prática)
        }
    }
}
