public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== Iniciando Sistema da Clínica Vida Plena ===");

        // 1. Criando um paciente com dados fictícios.
        Paciente paciente1 = new Paciente(
            "Ícaro Ferreira Franklin", 
            "000.000.000-00", 
            22, 
            110.0, 
            "Sem condições pré-existentes."
        );

        // 2. Criando uma consulta para este paciente.
        Consulta consulta1 = new Consulta(
            "13/10/2025", 
            "Cardiologia", 
            "Dr(a). Antonio Carlos Sobral Sousa"
        );

        // 3. Mostrando as informações iniciais na tela.
        System.out.println("\n--- INFORMAÇÕES INICIAIS ---");
        paciente1.exibirDetalhes();
        consulta1.exibirResumo();

        // 4. Simulando a realização da consulta.
        System.out.println("\n... Simulando a realização da consulta ...\n");
        consulta1.confirmarRealizacao(); // O status interno do objeto muda para "Realizada".

        // 5. Exibindo as informações atualizadas.
        System.out.println("--- INFORMAÇÕES APÓS A CONSULTA ---");
        consulta1.exibirResumo();
        
        System.out.println("\n=== Sistema Finalizado ===");
    }
}