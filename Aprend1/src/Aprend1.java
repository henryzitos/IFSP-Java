import java.util.Scanner;

public class Aprend1 {
    public static void main (String[] args){
        double n1;
        double n2;
        double r = 0;
        char op;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite a operacao que quer usar (+, -, *, /): ");
            op = entrada.next().charAt(0);

            System.out.println("Digite um número: ");
            n1 = entrada.nextDouble();

            System.out.println("Digite outro número: ");
            n2 = entrada.nextDouble();

            switch ((char)op) {

                case '+':
                    r = n1 + n2;
                    System.out.println("Resultado: " + r);
                    break;

                case '-':
                    r = n1 - n2;
                    System.out.println("Resultado: " + r);
                    break;

                case '*':
                    r = n1 * n2;
                    System.out.println("Resultado: " + r);

                case '/':
                    r = n1 / n2;
                    System.out.println("Resultado: " + r);

                case '0':
                    System.out.println("Programa finalizado.");
                    
                default:
                    System.out.println("Operador inválido. Digite um opeador válido");

            }
        } while (op != '0');
    }
}