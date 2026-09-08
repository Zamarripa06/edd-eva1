public class Eva1_6_ARREGLOS {
    public static void main(String[] args) {
        int[] datos = new int[1000000000];//4 Gb
        System.out.println("Datos: " + datos);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);
        }
    }
}