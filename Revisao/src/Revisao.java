import java.util.Scanner;
//@henryzitos_

public class Revisao {
    public static Scanner scan = new Scanner(System.in);

    public static void mostraNomes(String[] nomes) {
        System.out.println("Os nomes que você digitou são: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s ", nomes[i]);
        }
        System.out.println();
    }

    public static void matrizValores(double[][] contas) {

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i==j){
                    contas[i][j] = contas[i-i][j] * contas[i][j-j];
                } else {
                    contas[i][j] = contas[i][j-j] - contas[i-i][j];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(contas[i][j] + " ");
            }
            System.out.println();
        }
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

        System.out.println("Digite um número DOUBLE: ");
        contas[0][1] = scan.nextDouble();
        contas[1][0] = contas[0][1];
        System.out.println("Digite um número DOUBLE: ");
        contas[0][2] = scan.nextDouble();
        contas[2][0] = contas[0][2];
        System.out.println("Digite um número DOUBLE: ");
        contas[0][3] = scan.nextDouble();
        contas[3][0] = contas[0][3];

        matrizValores(contas);
    }
}
