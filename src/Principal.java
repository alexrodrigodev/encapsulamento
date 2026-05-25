public class Principal {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.cargo = "Desenvolvedor";
        funcionario.salario = 8500;

        funcionario.exibirInformacoes();
        funcionario.reajustarSalario(5);
        funcionario.exibirInformacoes();
    }
}
