public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        // Ler dados dos funcionários e criar objetos
        lerDadosFuncionario(empresa, 1, 5000, Cargo.DESENVOLVEDOR, "Lucas Chagas");
        lerDadosFuncionario(empresa, 2, 6000, Cargo.GERENTE, "Gustavo Rodrigues");
        lerDadosFuncionario(empresa, 3, 4000, Cargo.SUPORTE, "Daniel Jones");

        System.out.println("Bem vindo ao Sistema TOTVS");
        System.out.println("");

        System.out.println("Funcionários:");
        System.out.println("");

        //Foreach para percorrer a Array dos funcionarios e imprimir
        for (Funcionario funcionarios : empresa.getFuncionarios()) {
            System.out.println("Nome: " + funcionarios.nome);
            System.out.println("ID: " + funcionarios.id);
            System.out.println("Cargo: " + getCargo(funcionarios));
            System.out.println("Salário Calculado: R$ " + funcionarios.calcularSalario(funcionarios.salario));
            System.out.println("");
        }

        // Calcular e exibir a folha salarial total
        System.out.println("Folha Salarial Total: R$ " + empresa.calcularFolhaSalarial());

    }

    public static void lerDadosFuncionario(Empresa empresa, int id, double salarioBase, Cargo cargo, String nome) {
        Funcionario funcionario = null;
        switch (cargo) {
            case DESENVOLVEDOR:
                funcionario = new Desenvolvedor(nome, id, salarioBase);
                break;
            case GERENTE:
                funcionario = new Gerente(nome, id, salarioBase);
                break;
            case SUPORTE:
                funcionario = new Suporte(nome, id, salarioBase);
                break;
        }
        empresa.adicionarFuncionario(funcionario);
    }

    public static String getCargo(Funcionario f) {
        if (f instanceof Desenvolvedor) {
            return "Desenvolvedor";
        } else if (f instanceof Gerente) {
            return "Gerente";
        } else if (f instanceof Suporte) {
            return "Suporte";
        } else {
            return "Cargo não identificado";
        }
    }
}