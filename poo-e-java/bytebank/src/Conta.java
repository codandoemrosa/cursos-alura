public class Conta {
        double saldo;
        int agencia;
        int numeroConta;
        String titular;
        public void deposita(double valor){
                this.saldo += valor; //saldo = saldo + valor;
        }
        public boolean saca(double valor){
                if (this.saldo >= valor){
                        this.saldo -= valor; //saldo = saldo - valor;
                        return true;
                } else {
                        System.out.println("Você não tem saldo suficiente!");
                        return false;
                }
        }
        public boolean transfere(double valor, Conta destino){
                if(this.saldo >= valor){
                        this.saldo -= valor;
                        destino.deposita(valor); //mesma coisa de destino.saldo += valor;.
                        return true;
                } else {
                        System.out.println("Você não tem saldo suficiente!");
                        return false;
                }
        }
}
