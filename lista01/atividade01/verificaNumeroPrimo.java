package lista01.atividade01;
import java.util.Scanner;

public class verificaNumeroPrimo {
    public static void main(String args[]){       
      verificaNumeroPrimo(4);
    }

    private static void verificaNumeroPrimo(Integer n){
        for (int j = 2; j < n; j++) {
            if (n % j == 0)
            System.out.println(n + " não é primo");
        }
        System.out.println(n + " é primo");
    }
}
