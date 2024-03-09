public class Suporte extends Funcionario {
    public Suporte(String nome, int id, double salario) {
        super(nome, id, salario);
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.05; // 5% de bônus
    }
}
