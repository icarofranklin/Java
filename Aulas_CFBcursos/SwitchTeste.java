public class SwitchTeste {
    public static void main(String[] args) {
        // Estrutura Switch em Java
        // continuação da aula3.java

        int pos=7; // posição no pódio

        switch(pos){
            case 1 -> System.out.println("Primeiro lugar, o mior, siiiiiiir"); 
            case 2 -> System.out.println("Segundo lugar");
            case 3 -> System.out.println("Terceiro lugar");
            case 4, 5, 6 -> System.out.println("Premiação de participação, para não voltar de mãos vazias");
            default -> System.out.println("Não sobrou nada\nPress F to pay respects");
            // break não é necessário com a sintaxe "->"
        }
    }
}