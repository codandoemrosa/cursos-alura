public class TestaBanco {

    public static void main(String[] args) {
        Cliente erick = new Cliente();

        erick.nome ="Erick Leda";
        erick.cpf ="123.456.789-00";
        erick.profissao ="Desenvolvedor Fullstack Pleno";

        Conta contaDoErick = new Conta();
        contaDoErick.deposita(100);

        contaDoErick.titular = erick;
        System.out.println("O titular dessa conta é " + contaDoErick.titular.nome);
    }
}
