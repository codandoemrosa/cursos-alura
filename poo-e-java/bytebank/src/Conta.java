public class Conta {
        double saldo;
        int agencia;
        int numeroConta;
        String titular;
        public void deposita(double valor){
                this.saldo += valor; //saldo = saldo + valor;
        }
}
