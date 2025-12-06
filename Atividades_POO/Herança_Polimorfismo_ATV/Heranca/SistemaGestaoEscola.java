class Estudante { // clase base ou superclasse
    protected String nome; 
    protected int idade;
    protected String matricula;
    protected double[] notas;

    // Construtor
    public Estudante(String nome, int idade, String matricula, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.notas = notas;
    }
    
    // Notas dos alunos(Calculo)
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        if (notas.length == 0) return 0.0;
        return soma / notas.length;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Média: %.2f\n", calcularMedia());
    }
}


class EstudanteGraduacao extends Estudante { // classe herdeira graduaçao
    private String curso;
    private int periodo;

    public EstudanteGraduacao(String nome, int idade, String matricula, double[] notas, String curso, int periodo) {
        super(nome, idade, matricula, notas); 
        this.curso = curso;
        this.periodo = periodo;
    }

    @Override
    public void exibirDados() {
        System.out.println("--- Estudante de Graduação ---");
        super.exibirDados(); // Reutiliza a exibição da classe base 
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo + "º");
    }
}

class EstudantePosGraduacao extends Estudante { // classe herdeira posgraduado
    private String programa;
    private String orientador;
    private String tituloTese;

    public EstudantePosGraduacao(String nome, int idade, String matricula, double[] notas, String programa, String orientador, String tituloTese) {
        super(nome, idade, matricula, notas);
        this.programa = programa;
        this.orientador = orientador;
        this.tituloTese = tituloTese;
    }

    @Override
    public void exibirDados() {
        System.out.println("--- Estudante de Pós-Graduação ---");
        super.exibirDados();
        System.out.println("Programa: " + programa);
        System.out.println("Orientador: " + orientador);
        System.out.println("Título da Tese: " + tituloTese);
    }
}

public class SistemaGestaoEscola {
    public static void main(String[] args) {
        // Notas para teste
        double[] notasAluno1 = {7.5, 8.0, 9.5};
        double[] notasAluno2 = {9.0, 9.5, 10.0};

        
        Estudante e1 = new EstudanteGraduacao(
            "Ícaro Ferreira Franklin", 
            22, 
            "16035352", 
            notasAluno1, 
            "Ciencias da Computação", 
            3
        );

        
        Estudante e2 = new EstudantePosGraduacao(
            "Ícaro Ferreira Franklin", 
            22, 
            "16035352", 
            notasAluno2, 
            "Mestrado em Machine Learning", 
            "Mariana Lira de Farias", 
            "Avanço do Machine Learning em Sistemas Embarcados"
        );

        e1.exibirDados();
        System.out.println(); 
        e2.exibirDados();
    }
}