import java.util.Scanner;

/* b) Escreva um algoritmo que solicite ao usuário um número inteiro de 1 a 12 e
exiba a quantidade de dias do mês correspondente. */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 12:");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
            System.out.println("Você digitou: " + numero + ": Janeiro tem 31 dias.");
                break;
            case 2:
            System.out.println("Você digitou: " + numero + ": Fevereiro tem 28 dias.");
                break;
            case 3:
            System.out.println("Você digitou: " + numero + ": Março tem 31 dias.");
                break;
            case 4:
            System.out.println("Você digitou: " + numero + ": Abril tem 30 dias.");
                break;
            case 5:
            System.out.println("Você digitou: " + numero + ": Maio tem 31 dias.");
                break;
            case 6:
            System.out.println("Você digitou: " + numero + ": Junho tem 30 dias.");
                break;
            case 7:
            System.out.println("Você digitou: " + numero + ": Julho tem 31 dias.");
                break;
            case 8:
            System.out.println("Você digitou: " + numero + ": Agosto tem 31 dias.");
                break;
            case 9:
            System.out.println("Você digitou: " + numero + ": Setembro tem 29 dias.");
                break;
            case 10:
            System.out.println("Você digitou: " + numero + ": Outubro tem 31 dias.");
                break;
            case 11:
            System.out.println("Você digitou: " + numero + ": Novembro tem 30 dias.");
                break;
            case 12:
            System.out.println("Você digitou: " + numero + ": Dezembro tem 29 dias.");
                break;
            default:
            System.out.println("Digite um número válido entre 1 e 12.");
                break;
        }

    }
}
