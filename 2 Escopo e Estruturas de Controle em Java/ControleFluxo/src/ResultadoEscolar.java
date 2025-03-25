public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        if (nota >= 7) {
            System.out.println("Aprovado");

        } else if (nota >= 5 && nota < 7 ) {
            System.out.println("Recuperação");

        } else {
            System.out.println("Reprovado");

        }

        //condição ternária - cenário 1
        nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        
        // condição ternária - cenário 2
        nota = 6;
        resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
            
    }
}
