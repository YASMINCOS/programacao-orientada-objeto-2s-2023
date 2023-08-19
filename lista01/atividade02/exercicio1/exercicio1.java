package lista01.atividade02.exercicio1; 
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = calculadora.somar(num1, num2);
                break;
            case '-':
                resultado = calculadora.subtrair(num1, num2);
                break;
            case '*':
                resultado = calculadora.multiplicar(num1, num2);
                break;
            case '/':
                try {
                    resultado = calculadora.dividir(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                System.exit(1);
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
