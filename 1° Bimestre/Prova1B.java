import java.util.Scanner;

public class Prova {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ex1();
        ex2();
    }

    public static int ex1() {
        double x;
        double y;
        int opc;

        System.out.println("Digite um número DOUBLE: ");
        x = scan.nextDouble();
        System.out.println("Digite outro número DOUBLE: ");
        y = scan.nextDouble();

        System.out.println("Digite um número correspondente a operação que quer realizar: ");
        System.out.println("--- 1. Soma | 2. Subtração | 3. Multiplicação | 4. Divisão ---");
        opc = scan.nextInt();

        System.out.print(ex1cont(opc, x, y));

        System.out.println();
        return 0;
    }

    public static Object ex1cont(int opc, double x, double y) {
        double r;
        switch(opc){
            case 1:
                r = x + y;
                System.out.println("O resultado da soma é: ");
                return r;
            case 2:
                r = x - y;
                System.out.println("O resultado da subtração é: ");
                return r;
            case 3:
                r = x * y;
                System.out.println("O resultado da multiplicação é: ");
                return r;
            case 4:
                r = x / y;
                System.out.println("O resultado da divisão é: ");
                return r;

            default:
                System.out.println("Opção inválida");
        }
        return null;
    }

    public static int ex2() {
        int x;
        int y;
        int k = 0;

        System.out.println("Digite um número: ");
        x = scan.nextInt();
        System.out.println("Digite outro número: ");
        y = scan.nextInt();

        int[][] matriz = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriz[i][j] = k;
                k = k + 1;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }

        return 0;
    }
}
