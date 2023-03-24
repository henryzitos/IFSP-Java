import java.util.Scanner;

public class Revisao {
    public static Scanner scan = new Scanner(System.in);

    public static void mostraNomes(String[] nomes) {
        System.out.println("Os nomes que você digitou são: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s ", nomes[i]);
        }
        System.out.println();
    }

    public static void matrizValores(double[][] contas, double[] numeros) {

    }

    public static void escolheNomes(String[] nomes) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um número inteiro: ");
            int input = scan.nextInt();

            if (input == 1) {
                System.out.println(nomes[0]);
            } else if (input <= 10) {
                System.out.println(nomes[1]);
            } else if (input > 10) {
                System.out.println(nomes[2]);
            } else {
                System.out.println("Número inválido! Digite um número inteiro.");
            }

        }
    }

    public static void main(String[] args) {
        String[] nomes = new String[3];
        double[][] contas = new double[4][4];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº nome: ", i+1);
            System.out.println();
            nomes[i] = scan.nextLine();
        }

        mostraNomes(nomes);
        escolheNomes(nomes);

        double[] numeros = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número DOUBLE: ");
            numeros[i] = scan.nextDouble();
        }

        matrizValores(contas, numeros);
    }
}