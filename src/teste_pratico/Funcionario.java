import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String func;

    public Funcionario(String nome, LocalDate nascimento, BigDecimal salario, String func) {
        super(nome, nascimento);
        this.salario = salario;
        this.func = func;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFunc() {
        return func;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + nome + 
               ", Data de Nascimento: " + nascimento.format(formatter) + 
               ", Salário: " + String.format("%,.2f", salario) + 
               ", Função: " + func;
    }
}
