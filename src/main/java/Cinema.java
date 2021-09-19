import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Sala> salas;
    private List<Funcionario> funcionarios;

    public Cinema() {
        this.salas = new ArrayList<Sala>();
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public List<Sala> getSalas() {
        return this.salas;
    }

    public void adicionarSala(Sala sala) {
        this.salas.add(sala);
    }

    public void removerSala(Sala sala) {
        this.salas.remove(sala);
    }

    public List<Funcionario> getfuncionarios() {
        return this.funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }
}
