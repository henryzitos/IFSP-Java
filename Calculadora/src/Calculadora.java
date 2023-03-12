import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args){
        double n1;
        double n2;
        double r = 0;
        char op;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite a operacao que quer usar (+, -, *, /): ");
            op = entrada.next().charAt(0);

            switch ((char)op) {

                case '+':
                    System.out.println("Digite um número: ");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite outro número: ");
                    n2 = entrada.nextDouble();

                    r = n1 + n2;
                    System.out.println("Resultado: " + r);
                    break;

                case '-':
                    System.out.println("Digite um número: ");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite outro número: ");
                    n2 = entrada.nextDouble();

                    r = n1 - n2;
                    System.out.println("Resultado: " + r);
                    break;

                case '*':
                    System.out.println("Digite um número: ");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite outro número: ");
                    n2 = entrada.nextDouble();

                    r = n1 * n2;
                    System.out.println("Resultado: " + r);

                case '/':
                    System.out.println("Digite um número: ");
                    n1 = entrada.nextDouble();
                    System.out.println("Digite outro número: ");
                    n2 = entrada.nextDouble();

                    r = n1 / n2;
                    System.out.println("Resultado: " + r);

                case '0':
                    System.out.println("Programa finalizado.");

                default:
                    System.out.println("Operador inválido.");

            }
        } while (op != '0');
    }
}