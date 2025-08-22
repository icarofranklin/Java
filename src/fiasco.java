public class main {
    public static void main(String[] args) {
    //Tipos primitivos
        int idade = 22;
        double altura = 1.80;
        char letra = 'A';
        long numerosGrandes = 99999999L; //Por que não colocar long na porra toda? Lá ele
        //Por que ocupa muita memória
    // Tipos não primitivos
        String nome = "Ícaro Franklin";
    //E qual a diferença dos dois? Os não primitivos permitem mais alterações
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Letra: " + letra);
        System.out.println("Número grande: " + numerosGrandes);
        System.out.println("Nome: " + nome);
    }
}