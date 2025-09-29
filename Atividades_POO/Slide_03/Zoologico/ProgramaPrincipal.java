public class ProgramaPrincipal {

    public static void main(String[] args) {

        Animal meuAnimal = new Animal("Dalila", "Cachorra", 5);

        System.out.println("--- Informações Iniciais do Animal ---");
        meuAnimal.exibirInformacoes();

        meuAnimal.setIdade(10);

        System.out.println("\n--- Informações Atualizadas do Animal ---");
        meuAnimal.exibirInformacoes();
    }
}