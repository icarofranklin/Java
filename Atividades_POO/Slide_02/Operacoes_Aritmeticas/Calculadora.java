package Operacoes_Aritmeticas;

public class Calculadora {
    //1. atributos privados: os dados da operação fiam protegidos
    private final int numero1;
    private final int numero2;
    private final char operador;

    //2. construtor: cria um objeto Calculadora já com todos os dados necessários
    public Calculadora(int numero1, int numero2, char operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }
    // 3. método público: O coração da classe, onde acontece a mágica
    public double executarOperacao() {
        switch (operador) {
            case '+' -> {
                return this.numero1 + this.numero2;
            }
            case '-' -> {
                return this.numero1 - this.numero2;
            }
            case '*' -> {
                return this.numero1 * this.numero2; 
            }
            case '/' -> {
                // Tratamento de caso especial: divisão por zero
                if (this.numero2 == 0) { 
                    // Lançar uma exceção é a forma correta do objeto "avisar" que algo deu errado.
                    throw new IllegalArgumentException("Erro: Divisão por zero não é permitida.");
                }
                // Fazemos um "cast" para double para garantir que o resultado seja decimal.
                // Sem o (double), 5 / 2 resultaria em 2 (divisão de inteiros).
                return (double) this.numero1 / this.numero2;
            }
            default -> {
                // Lançar uma exceção para operação inválida
                throw new IllegalArgumentException("Erro: Operação inválida. Use +, -, * ou /.");
            }
        }
    }
    // 4. Getters e Setters: permitem acesso controlado aos atributos privados e vai cair na prova
    public int getNumero1() { return numero1; }
    public int getNumero2() { return numero2; }
    public char getOperacao() { return operador; }
}
