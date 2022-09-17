public class Conta {
        private double saldo;
        private int agencia;
        private int numeroConta;
        private Cliente titular;
        public void deposita(double valor){
                this.saldo += valor; //saldo = saldo + valor;
        }

        public boolean saca(double valor){
                if (this.saldo >= valor){
                        this.saldo -= valor; //saldo = saldo - valor;
                        return true;
                } else {
                        System.out.println("Você não tem saldo suficiente para realizar a transferência!");
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

        public double getSaldo(){
                return this.saldo;
        }
        public int getNumeroConta() { return this.numeroConta; }
        public void setNumeroConta(int numeroConta){
                this.numeroConta = numeroConta;
        }

        public void setAgencia(int agencia) {
                this.agencia = agencia;
        }
}
