public class Teste {

    public static void main(String[] args) {
        FuncionarioTeste funcionario1 = new FuncionarioTeste();
        funcionario1.setSalario(3000.0);
        System.out.println("Sua bonificação é de R$" + funcionario1.getBonificacao());

        FuncionarioTeste funcionario2 = new FuncionarioTeste();
        funcionario2.setTipo(1);
        funcionario2.setSalario(5000.0);
        System.out.println("Sua bonificação é de R$" + funcionario2.getBonificacao());
    }
}
