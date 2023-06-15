public class Pessoa {
    private String nome;
    protected int idade;

    public Pessoa(){}

    public Pessoa(String nome, int idade){
        System.out.println("Criei um nova pessoa!");
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá! Meu nome é " + this.nome + " e tenho " + this.idade + " anos");
    }

    public String getNome(){
        return this.nome;
    }

    public String setIdade(int idade){
        if (idade > this.idade){
            this.idade = idade;
            return "Troca realizada";
        }
        else {
            return "Troca inválida";
        }
    }

    public int getIdade(){
        return this.idade;
    }

}
