public class Principal {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 8500);
        funcionario.setCargo("Desenvolvedor");

        System.out.println("Funcionário tem o cargo: " + funcionario.getCargo());

        funcionario.exibirInformacoes();
        funcionario.reajustarSalario(5);
        funcionario.exibirInformacoes();
    }
}
