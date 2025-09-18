public class OperadorTernario {
    public static void main (String[] args){
        // Operador ternário em Java
        // (condição) ? valor_se_verdadeiro : valor_se_falso;
        // continuação aula3.java
        int nota=80;
        int media=60;
        
        String res;
        res=(nota >= media) ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + res);
    }
}
