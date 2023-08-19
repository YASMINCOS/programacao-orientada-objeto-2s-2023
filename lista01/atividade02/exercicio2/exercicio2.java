package lista01.atividade02.exercicio2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        temperaturaConverter converter = new temperaturaConverter();

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            converter.setCelsius(celsius);
            converter.celsiusToFahrenheit();
            System.out.println("Temperatura em Fahrenheit: " + converter.getFahrenheit());
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            converter.setFahrenheit(fahrenheit);
            converter.fahrenheitToCelsius();
            System.out.println("Temperatura em Celsius: " + converter.getCelsius());
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
