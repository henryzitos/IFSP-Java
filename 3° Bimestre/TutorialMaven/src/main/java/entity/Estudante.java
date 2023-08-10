package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estudante")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String primeiroNome;
    @Column
    private String sobrenome;
    @Column
    private String email;

    public Estudante(String primeiroNome, String sobrenome, String email) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudante{" + "id=" + id + ", primeiroNome='" + primeiroNome + '\'' + ", sobrenome='" + sobrenome + '\'' + ", email='" + email + '\'' + '}';
    }
}
