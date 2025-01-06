import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para a conta: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite outro numero inteiro: ");
        int n2 = scanner.nextInt();

       int soma = n1 + n2;

       System.out.println(soma);

    } 
}
