package Polimorfismo.Animal;

public class aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.locomover();
        m.emitirSom();
        m.alimentar();
        System.out.println("Peso do mamífero: " + m.getPeso());
        System.out.println("Cor do pelo: " + m.getCorPelo());
    }
}
