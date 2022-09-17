public class TesteGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(4423, 23662);

        conta.setNumeroConta(1337);
        System.out.println(conta.getNumeroConta());

        Cliente paulo = new Cliente();
        conta.setTitular(paulo);  //conta.titular = paulo;
        paulo.setNome("Paulo Silveira"); //conta.nome = "Paulo Silveira";

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

        /* mesma coisa de cima, em duas linhas

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

         */
    }
}
