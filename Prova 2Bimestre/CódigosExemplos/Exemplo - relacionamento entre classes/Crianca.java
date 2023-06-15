public class Crianca extends Pessoa{
    private int machucados;

    public Crianca(String nome, int idade, int machucados){
        super(nome, idade);
        this.machucados = machucados;
    }

    public void envelhecer(){
        this.idade++;
    }
}
