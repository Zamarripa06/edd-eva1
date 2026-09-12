public class Eva1_7_ARREGLOSSIZE {
    public static void main(String[] args) {
        int[] original = new int[10];
        System.out.println(original);
        for(int i =0; i < original.length; i++) {     //LLENAR CON DATOS ALEATORIOS
            original[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < original.length; i++) {   //IMPRIMIR
            System.out.println("[" + original[i] + "]");
        }
        System.out.println("");
        //CAMBIAR EL TAMAÑO (NO SE PUEDE)
        //RESPALDO
        int[] copia = original;
        original = new int[5];
        System.out.println(original);
        for (int i = 0; i < original.length; i++) {    //IMPRIMIR ALGO MODIFICADO
            System.out.println("[" + original[i] + "]");
        }
    }
}