import model.Empresa;
import model.Produto;
import model.Servico;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.addItem(new Produto("Pá", 50.2,1));
        empresa.addItem(new Servico("Limpeza", 100.0));

        empresa.comercializarItem(0L);
        empresa.comercializarItem(0L);
        empresa.comercializarItem(1L);
        empresa.comercializarItem(1L);
    }
}
