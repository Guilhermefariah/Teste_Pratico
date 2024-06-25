import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    protected LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
}
