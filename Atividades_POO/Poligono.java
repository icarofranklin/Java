/*Primeiro uso de encapsulamento em Java*/
public final class Poligono {
        /* 1. ATRIBUTO PRIVADO
        O número de lados agora é uma característica interna do Polígono.
        'private' significa que só a própria classe Poligono pode acessar este dado diretamente.*/
    private int numeroDeLados;
        /* 2. CONSTRUTOR
        Um método especial que "constrói" o objeto. Ele é chamado quando usamos a palavra 'new'.
        Obrigamos que, para criar um Polígono, seja informado o número de lados.*/
    public Poligono(int numeroDeLados) {
        /* O método setNumeroDeLados garante que a validação seja aplicada desde o momento da criação do objeto.*/
        this.setNumeroDeLados(numeroDeLados);
    }
        /* 3. MÉTODO GETTER (Acessor)
        Fornece um acesso de LEITURA ao atributo privado.
        Permite que o mundo exterior veja qual é o número de lados, mas sem poder alterá-lo diretamente.*/
    public int getNumeroDeLados(){
        return this.numeroDeLados;
    }
        /* 4. MÉTODO SETTER (Modificador)
        Fornece um acesso de ESCRITA ao atributo privado.
        É o "portão" de entrada para os dados. Aqui podemos adicionar regras e validações.*/
    public void setNumeroDeLados(int novoNumeroDelados){
        /* Regra obrigatória: Um polígono precisa ter mais de 2 lados */
        if (novoNumeroDelados > 2){
            this.numeroDeLados = novoNumeroDelados;
        } else {
            /* Se o valor for inválido, pode lançar um erro ou definir um valor padrão. O programa ira imprimir uma mensagem e manter um valor padrão mínimo*/
            System.out.println("Número de lados inválido. Um polígono precisa ter mais de 2 lados.");
            this.numeroDeLados = 3; /* Valor padrão mínimo, definindo como triângulo*/
        }    
     }
        /* 5. MÉTODO DE LÓGICA (Comportamento) 
        A lógica de negócio pretence ao próprio Polígono.
        O objeto "sabe" como calcular suas próprias diagonais.*/
        public int calcularNumeroDeDiagonais(){
            /* A fórmula usa o atributo 'this.numeroDeLados' do próprio objeto.*/
            int numeroDeDiagonais = (this.numeroDeLados * (this.numeroDeLados - 3)) / 2;
            return numeroDeDiagonais;
        }
}