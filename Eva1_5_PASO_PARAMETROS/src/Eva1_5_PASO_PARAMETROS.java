public class Eva1_5_PASO_PARAMETROS {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("Valor de i = " + i);
        incrementar(i);
        System.out.println("Valor de i (despues de incrementar) = " + i);
        //AHORA PASO POR RFEFENCIA
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba.y = " + prueba.y);
        incrementarObj(prueba);
        System.out.println("Valor de prueba.y (despues de incrementar) = " + prueba.y);
    }
    public static void incrementar(int valor) { //PASO POR VALOR (RECIBO UNA COPIA)
        valor++;
    }
    public static void incrementarObj(Prueba objeto) { //PASO POR REFERENCIA (RECIBO LA DIRECCION DE MEMORIA)
        objeto.y++;
        
    }
}

class Prueba {
    int y = 5;
}