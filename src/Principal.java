public class Principal {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 8500);
        funcionario.setCargo("Desenvolvedor");

        System.out.println("Funcionário tem o cargo: " + funcionario.getCargo());
        System.out.println("Funcionário tem o nome: " + funcionario.getNome());
        System.out.println("Funcionário tem o salário: " + funcionario.getSalario());

        funcionario.reajustarSalario(5);
        funcionario.reajustarSalario(10);
        funcionario.exibirInformacoes();
    }
}
