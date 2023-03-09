import java.util.Scanner;

public class poliana {
    public static void main(String[] args) {
        Scanner posicaox = new Scanner (System.in);
        Scanner posicaoo = new Scanner (System.in);

        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        for (int jogada = 0; jogada < 9; jogada++) {

            if (jogada % 2 != 0) {
                System.out.println("Jogada do x. Escolha um número.");
                tab(tabuleiro);
                int posx = posicaox.nextInt();
            } else {
                System.out.println("Jogada da o. Escolha um número.");
                int poso = posicaoo.nextInt();
            }

        }

        tab(tabuleiro);

    }

    public static void tab(char[][] tabuleiro){


        System.out.println(" 1 | 2 | 3 ");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("-----------");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("");
    }
}
