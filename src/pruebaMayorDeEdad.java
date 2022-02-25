
import java.util.Scanner;

public class pruebaMayorDeEdad {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor ingrese su edad");
        int edad = Integer.valueOf(scan.nextLine());
        if (edad <= 18) {
            System.out.println("Usted es menor de edad, el acceso ha sido denegado.");
        } else {
            System.out.println("Usted es mayor de edad, bienvenido al club!!");
        }
    }
}
