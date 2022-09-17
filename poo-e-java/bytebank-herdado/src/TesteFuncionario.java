public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("233.444.555-56");
        nico.setSalario(2500.00);

        System.out.println("Olá, " + nico.getNome());
        System.out.println("Sua bonificação é de R$" + nico.getBonificacao());

    }
}
