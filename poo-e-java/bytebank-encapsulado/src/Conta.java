public class Conta {
        private double saldo;
        private int agencia;
        private int numeroConta;
        private Cliente titular;
        private static int total = 0;
        public void deposita(double valor){
                this.saldo += valor; //saldo = saldo + valor;
        }

        public Conta(){
        }
        public Conta(int agencia, int  numeroConta){ //construtor
                Conta.total++;
                System.out.println("Temos um total de " + Conta.total + " contas ativas.");
                this.agencia = agencia;
                this.numeroConta = numeroConta;
                System.out.println("Sua agência é: " + this.agencia);
                System.out.println("Sua conta é: " + this.numeroConta);
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
                if(numeroConta <= 0) {
                        System.out.println("Valor inválido.");
                        return;
                }
                this.numeroConta = numeroConta;
        }

        public void setAgencia(int agencia) {
                if (agencia <= 0){
                        System.out.println("Valor inválido.");
                        return;
                }
                this.agencia = agencia;
        }

        public void setTitular(Cliente titular) {
                this.titular = titular;
        }

        public Cliente getTitular() {
                return titular;
        }
}
