public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaCliente = new Conta();
        contaCliente.saldo = 100;
        contaCliente.deposita(50);
        System.out.println(contaCliente.saldo);

        contaCliente.saca(50);
        System.out.println(contaCliente.saldo);

    }
}
