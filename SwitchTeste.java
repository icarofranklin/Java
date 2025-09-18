public class SwitchTeste {
    public static void main(String[] args) {
        // Estrutura Switch em Java
        int pos=1; // posição no pódio

        switch(pos){
            case 1 -> System.out.println("Primeiro lugar, o mior"); 
            case 2 -> System.out.println("Segundo lugar");
            case 3 -> System.out.println("Terceiro lugar");
            case 4, 5, 6 -> System.out.println("Premiação de participação");
            default -> System.out.println("Não está no pódio\nPress F to pay respects");
            // break não é necessário com a sintaxe "->"
        }
    }
}
