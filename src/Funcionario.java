public class Funcionario {
    private String nome;

    private String cargo;

    private double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibirInformacoes() {
        System.out.printf("\nFuncionario %s - Cargo> %s - Salário %.2f", nome, cargo, salario);
    }


    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salario de %s é %.2f ", nome, salario);

    }
}
