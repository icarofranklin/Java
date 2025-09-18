public class aula2 {
    public static void main(String[] args) {
        // Tipos de variáveis em Java
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int soma = n1 + n2 + n3;

        int idade = 20; // variável do tipo inteiro
        String nome = "Ícaro Franklin"; // variável do tipo string
        float altura = 1.80f; // variável do tipo float
        double peso = 70.5; // variável do tipo double
        char sexo = 'M'; // variável do tipo char
        boolean estudante = true; // variável do tipo boolean

        // Imprimindo as variáveis na tela
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo:" + sexo);
        System.out.println("Estudante: " + estudante);
        System.out.println("A soma é: " + soma);
        
        System.out.println("\n");
        System.out.println("Curso do canal CFBCursos, o cara que faz os cursos gratuitos");
        // Println com quebra de linha automática
        System.out.print("Curso de Java\n");
        // ou pode ser usado \n
        System.out.printf("Canal:%s\nAno:%d", "Ícaro Franklin", 2025);
        // Printf sem quebra de linha automática
        // %s = string, %d = inteiro, %f = float
        // pode usar \n para quebra de linha ou %n

    }
}
