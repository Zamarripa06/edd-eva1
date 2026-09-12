public class Eva1_8_ARREGLOS_OBJETOS {
    public static void main(String[] args) {
        Ejemplo[] arreglo = null;
        arreglo = new Ejemplo[2];
        System.out.println("Arreglo = " + arreglo);
        System.out.println("Arreglo[0] = " + arreglo[0]);
        System.out.println("Arreglo[1] = " + arreglo[1]);
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("Arreglo[0] = " + arreglo[0]);
        System.out.println("Arreglo[1] = " + arreglo[1]);

        System.out.println("Arreglo[0].i = " + arreglo[0].i);
        System.out.println("Arreglo[1].i = " + arreglo[1].i);
    }
}

class Ejemplo {
    int i = 5;
}
