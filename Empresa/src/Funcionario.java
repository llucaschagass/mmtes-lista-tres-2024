abstract class Funcionario {
    protected String nome;
    protected int id;
    protected double salario;

    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public abstract double calcularSalario(double salarioBase);
}
