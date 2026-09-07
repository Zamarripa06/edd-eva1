public class Eva1_5_PASO_PARAMETROS {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Valor de i = " + i);
        incrementar(i);
        System.out.println("Valor de i (despues de incrementar) = " + i);
    }
    public static void incrementar(int valor) { //PASO POR VALOR (RECIBO UNA COPIA)
        valor++;
    }
}