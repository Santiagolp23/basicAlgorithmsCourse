
public class cuentaRegresiva {

    public static void main(String[] args) throws InterruptedException {

        for (int cantidadSegundos = 300; cantidadSegundos >= 0; cantidadSegundos--) {
            Thread.sleep(1000);
            System.out.println("La cantidad de segundos restantes es: " + cantidadSegundos);
        }
    }
}
