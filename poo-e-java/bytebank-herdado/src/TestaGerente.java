public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Marco Silva");
        gerente1.setCpf("123.456.789-00");
        gerente1.setSalario(5000.0);

        System.out.println(gerente1.getNome());
        System.out.println(gerente1.getCpf());
        System.out.println(gerente1.getSalario());

        gerente1.setSenha(2222);
        boolean autenticou = gerente1.autentica(2222);
    }
}
