import java.util.Scanner;

public class Transferencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Boolean verificacionCliente = true;
        Boolean verificacionDestino = true;
        String bancoCliente = "Scotiabank";
        Double saldoCliente = 2000000.0;
        int costoTransaccion = 0;
        System.out.println("Ingrese su nombre");
        String nombreCliente = leer.nextLine();
        System.out.println(
                "Bienvenid@ a Scotiabank " + nombreCliente + "\nPorfavor ingrese el nombre del banco destino: ");
        String bancoDestino = leer.nextLine();
        System.out.println("Escriba la hora: ");
        int horaTransferencia = Integer.valueOf(leer.nextLine());
        System.out.println("Escriba el monto: ");
        Double montoTransferencia = Double.valueOf(leer.nextLine());

        if (bancoCliente.equals(bancoDestino)) {
            costoTransaccion = 0;
        } else {
            costoTransaccion = 100;
            System.out.println(costoTransaccion);
        }

        if ((horaTransferencia >= 9 && horaTransferencia <= 12)
                || (horaTransferencia >= 15 && horaTransferencia <= 20)) {

            if (verificacionCliente && verificacionDestino) {
                System.out.println("El costo de la transferencia es: $" + costoTransaccion);
                if (saldoCliente < (montoTransferencia + costoTransaccion)) {
                    System.out.println("El saldo es insuficiente");
                } else {
                    System.out.println("La transferencia ha sido exitosa");
                    saldoCliente = saldoCliente - (montoTransferencia + costoTransaccion);
                }
            } else {
                System.out.println("La transferencia ha fallado, porfavor verifique su cuenta");
            }

        } else {
            System.out.println("Por favor realice la transferencia dentro del horario permitido: 9 a 12 ó 15 a 20");
        }
    }
}