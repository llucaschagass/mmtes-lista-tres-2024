import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaSalarial() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularSalario(f.salario);
        }
        return total;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}