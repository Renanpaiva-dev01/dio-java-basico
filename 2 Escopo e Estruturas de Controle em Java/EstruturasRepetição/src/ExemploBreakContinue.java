// class ExemploBreakContinue.java
public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                System.out.println("Pausou no numero 3");
                break;
            }
        }
        for (int numero = 1; numero <= 5; numero++) {
            //continue;
            System.out.println(numero);
        }
        // Qual a saída no console ?

    }
}