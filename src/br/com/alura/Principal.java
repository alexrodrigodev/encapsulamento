package br.com.alura;

public class Principal {
    static void main(String[] args) {
//        Funcionario funcionario = new Funcionario("João", 8500);
//        funcionario.setCargo("Desenvolvedor");
//
//        System.out.println("Funcionário tem o cargo: " + funcionario.getCargo());
//        System.out.println("Funcionário tem o nome: " + funcionario.getNome());
//        System.out.println("Funcionário tem o salário: " + funcionario.getSalario());
//
//        funcionario.reajustarSalario(5);
//        funcionario.reajustarSalario(10);
//        funcionario.exibirInformacoes();

        Funcionario gerente = new Gerente("Mario", 15000);
        ((Gerente) gerente).setBonus(1000);
        gerente.exibirInformacoes();
        gerente.reajustarSalario(2);



        Funcionario desenvolvedor = new Desenvolvedor("Carla", 12000, "Backend Java");
        desenvolvedor.exibirInformacoes();

    }
}
