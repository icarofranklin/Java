public class Consulta {
    // Atributos privados para garantir o encapsulamento.
    private String dataMarcada;
    private String especialidadeMedica;
    private String nomeProfissional;
    private String status;

    // Construtor: Define os dados da consulta e o status inicial.
    public Consulta(String data, String especialidade, String profissional) {
        this.dataMarcada = data;
        this.especialidadeMedica = especialidade;
        this.nomeProfissional = profissional;
        this.status = "Agendada"; // Toda consulta começa como "Agendada".
    }

    public void confirmarRealizacao() {
        this.status = "Realizada";
    }

    public void cancelar() {
        this.status = "Cancelada";
    }

    // Método para exibir um resumo da consulta.
    public void exibirResumo() {
        System.out.println("--- Detalhes da Consulta ---");
        System.out.println("Data: " + this.dataMarcada);
        System.out.println("Especialidade: " + this.especialidadeMedica);
        System.out.println("Profissional: " + this.nomeProfissional);
        System.out.println("Status: " + this.status);
        System.out.println("----------------------------");
    }
}