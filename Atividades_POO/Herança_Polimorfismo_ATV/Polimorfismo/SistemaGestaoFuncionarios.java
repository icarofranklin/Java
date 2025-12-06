class Funcionario {
    protected String nome;
    protected int idade;
    protected String id;
    protected double salarioBase;

    // Construtor
    public Funcionario(String nome, int idade, String id, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public double calcularPagamentoTotal() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Pagamento Total: R$ %.2f\n", calcularPagamentoTotal());
    }
}

class FuncionarioHorista extends Funcionario { // classe herdeira horista
    private int horasTrabalhadas;
    private double taxaPorHora;

    public FuncionarioHorista(String nome, int idade, String id, double salarioBase, int horasTrabalhadas, double taxaPorHora) {
        super(nome, idade, id, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    @Override
    public double calcularPagamentoTotal() {
        return horasTrabalhadas * taxaPorHora;
    }

    @Override
    public void exibirDados() {
        System.out.println("--- Funcionário Horista ---");
        super.exibirDados();
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Taxa por Hora: " + taxaPorHora);
    }
}

class FuncionarioMensalista extends Funcionario { // classe herdeira mensalista
    private double bonus;

    public FuncionarioMensalista(String nome, int idade, String id, double salarioBase, double bonus) {
        super(nome, idade, id, salarioBase);
        this.bonus = bonus;
    }

    
    @Override
    public double calcularPagamentoTotal() {
        return salarioBase + bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("--- Funcionário Mensalista ---");
        super.exibirDados(); 
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Bônus: " + bonus);
    }
}

public class SistemaGestaoFuncionarios {
    public static void main(String[] args) {
        
        
        Funcionario f1 = new FuncionarioHorista(
            "Ícaro Franklin", 
            22, 
            "Z4142", 
            1314.0, 
            160, 
            50.0
        );

        
        Funcionario f2 = new FuncionarioMensalista(
            "Ana Pereira", 
            45, 
            "M4141", 
            1580.0, 
            300.0  
        );

        
        f1.exibirDados();
        System.out.println(); 
        f2.exibirDados();
    }
}