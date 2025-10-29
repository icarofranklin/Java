public class Paciente {
    // Atributos são 'private' para proteger os dados.
    private String nomeCompleto;
    private final String cpf; 
    private int idade;
    private double pesoAtual;
    private String historicoMedico;

    // Construtor: "constrói" o objeto com os dados iniciais.
    public Paciente(String nome, String cpf, int idade, double peso, String historico) {
        this.nomeCompleto = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.pesoAtual = peso;
        this.historicoMedico = historico;
    }

    // Método para alterar o peso, com validação.
    public void setPesoAtual(double novoPeso) {
        if (novoPeso > 0) {
            this.pesoAtual = novoPeso;
        } else {
            System.out.println("O peso não pode ser negativo ou zero.");
        }
    }
    
    // Método para exibir as informações do paciente de forma organizada.
    public void exibirDetalhes() {
        System.out.println("--- Dados do Paciente ---");
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.pesoAtual + " kg");
        System.out.println("Histórico: " + this.historicoMedico);
        System.out.println("-------------------------");
    }
}