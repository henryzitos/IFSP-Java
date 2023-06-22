public class Gato extends Animal{
    private String pelagem;

    public Gato(String nome, Integer idade, String pelagem) {
        super(nome, idade);
        this.pelagem = pelagem;
    }

    @Override
    public void fazerBarulho(){
        System.out.println("Miau");
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public void mostrar(){
        System.out.println("O nome do Gato é:" + super.getNome());
    }

    @Override
    public String toString() {
        return super.toString() +
                " pelagem='" + pelagem + '\'';
    }
}
