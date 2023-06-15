import model.Biblioteca;
import model.CD;
import model.Livro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarItem(new CD("As Melhores", "Banda Djavu"));
        biblioteca.adicionarItem(new Livro("Turma da Mônica", "Mauricio de Souza"));

        biblioteca.listarItens();

        biblioteca.emprestrarItem(0);

        biblioteca.devolverItem(0);

        biblioteca.emprestrarItem(1);

        biblioteca.emprestrarItem(1);

        biblioteca.devolverItem(1);

        biblioteca.devolverItem(1);

    }
}