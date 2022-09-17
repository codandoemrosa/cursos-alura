public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaVazia = new Conta();
        System.out.println(contaVazia.getSaldo());

        contaVazia.titular = new Cliente();

        contaVazia.titular.nome = "Fulana de Tal";
        System.out.println(contaVazia.titular.nome);
    }
}
