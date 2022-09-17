public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaCliente = new Conta();
        contaCliente.saldo = 100;
        contaCliente.deposita(50);
        System.out.println(contaCliente.saldo);

        contaCliente.saca(50);
        System.out.println(contaCliente.saldo);

        Conta contaOutroCliente = new Conta();
        contaOutroCliente.deposita(1000);

        if (contaOutroCliente.transfere(300, contaCliente)){
            System.out.println("Transferência ocorrida com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(contaOutroCliente.saldo);
        System.out.println(contaCliente.saldo);

        contaCliente.titular = "Erick Leda";
        System.out.println("O titular da conta é: " + contaCliente.titular);

    }
}
