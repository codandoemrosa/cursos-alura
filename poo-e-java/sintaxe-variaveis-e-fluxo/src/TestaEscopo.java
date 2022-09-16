public class TestaEscopo {

    //serviu para estudar inicialização de variáveis
    public static void main(String[] args) {
        System.out.println("Testing conditionals");
        System.out.println("---------------------");

        int age = 19;
        int quantidadePessoas = 3;

        boolean accompained ;

        if(quantidadePessoas >= 2){
            accompained = true;
        }
        else {
            accompained = false;
        }

        if (age >= 18 && accompained){
            System.out.println("Welcome!");
        }
        else {
            System.out.println("You're underage.");
            System.out.println("Unfortunately, you can't come in.");
        }
    }
}
