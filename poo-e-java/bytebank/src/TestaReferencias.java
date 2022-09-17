public class TestaReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("O saldo da primeira conta é R$" + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("O saldo da segunda conta é R$" + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("O saldo da segunda conta é R$" + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        /* provando referenciação

        if(primeiraConta == segundaConta){
            System.out.println("São a mesmíssima conta");
        }
        */

        if(primeiraConta == segundaConta){
            System.out.println("Mesma conta");
        } else {
            System.out.println("Contas diferentes.");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
