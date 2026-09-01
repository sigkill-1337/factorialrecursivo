import java.util.Scanner;

public class App {


    public static int factorial(int numero){
        if(numero == 0){
            return 1;
        }else{
            return numero * factorial(numero - 1);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
        scanner.close();
    }
}
