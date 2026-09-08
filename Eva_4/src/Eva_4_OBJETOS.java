public class Eva_4_OBJETOS {
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.println(prueba);
        //ELIMINAR prueba;
        //Terminar el programa --> garbage collector (libera memoria correctamente)
        prueba = null;
    }
}

class Prueba{

}