public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, Integer idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void fazerBarulho(){
        System.out.println("AuAu");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() +
                " raca='" + raca + '\'';
    }
}
