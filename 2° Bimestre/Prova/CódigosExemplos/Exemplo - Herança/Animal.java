public abstract class Animal {
    private String nome;
    private Integer idade;

    public Animal(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerBarulho(){
        System.out.println("Barulho!!!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade;
    }
}
