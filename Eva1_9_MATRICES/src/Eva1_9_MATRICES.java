public class Eva1_9_ {
    public static void main(String[] args) {
        int[][] matriz = new int[5][3];
        System.out.println("matriz = " + matriz);
        System.out.println("matriz.length = " + matriz.length);
        System.out.println("matriz[0] = " + matriz[0]);
        System.out.println("matriz[0].length = " + matriz[0].length);
        System.out.println("matriz[1]] = " + matriz[1]);
        System.out.println("matriz[1].length = " + matriz[1].length);

        for (int i = 0;  i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i = 0;  i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
