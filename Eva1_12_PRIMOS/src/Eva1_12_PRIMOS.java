public class Eva1_12_PRIMOS {
    public static void main(String[] args) {
        int n = 53;
        boolean esprimo = true;
        for(int i = 2; i <= (n-1); i++) {
            if((n%i) == 0) {
                esprimo = false;
                break;
            }
        }
        if(esprimo == true) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }

        esprimo = true;
        int limite = (int)Math.sqrt(n);
        for(int i = 2; i <= limite; i++) {
            if((n%i) == 0) {
                esprimo = false;
                break;
            }
        }
        if(esprimo == true) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }
    }
}
