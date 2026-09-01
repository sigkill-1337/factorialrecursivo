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
        System.out.print("Enter a number: ");
        int numero = scanner.nextInt();
        System.out.println("Factorial of " + numero + " is: " + factorial(numero));
        scanner.close();
    }
}
