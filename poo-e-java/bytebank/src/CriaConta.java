public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta= new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        //--------------------------------------

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("Primeira conta tem R$" + primeiraConta.saldo);
        System.out.println("Segunda conta tem R$" + segundaConta.saldo);

        /* valores default são fixados em zero

        System.out.println(primeiraConta.agencia); //retorna 0;
        System.out.println(primeiraConta.numeroConta); //retorna 0;
        */

        segundaConta.agencia = 146;
        System.out.println("A segunda conta foi transferida para a agência " + segundaConta.agencia);

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
