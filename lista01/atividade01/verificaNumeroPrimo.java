package lista01.atividade01;
import java.util.Scanner;

public class verificaNumeroPrimo {
    public static void main(String args[]) {       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        verificaNumeroPrimo(numero);
    }

    private static void verificaNumeroPrimo(int n) {
        boolean isPrime = true; 

        if (n <= 1) {
            isPrime = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " é primo");
        } else {
            System.out.println(n + " não é primo");
        }
    }
}
