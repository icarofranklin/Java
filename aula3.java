public class aula3 {
    public static void main (String[] args){
        // Estruturas condicionais em Java
        // if, else if, else
        // ==, !=, <, >, <=, >= (true or false)
        
        int nota=70;
        int faltas =0;
        int maxfaltas=5;
        int media=60;

        if ((nota >= media) && (faltas <= maxfaltas)){
            System.out.println("Aprovado");
        } else if(nota >= 40){
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
    // Lembre-se de lógica matemática
        // Tabela verdade AND (&&)
        // V V = V
        // V F = F
        // F V = F
        // F F = F

        // Tabela verdade OR (||)
        // V V = V
        // V F = V
        // F V = V
        // F F = F