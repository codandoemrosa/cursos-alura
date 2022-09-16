
public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testing conditionals");
        System.out.println("---------------------");

        int age = 16;
        int quantidadePessoas = 3;

        if(age >= 18){
            System.out.println("Welcome!");
            System.out.println("You're over 18.");
        }

        else {
            if (quantidadePessoas >= 2){
                System.out.println("You're underage, but you're accompanied");
                System.out.println("Welcome!");
            }

            else {
                System.out.println("You're underage.");
                System.out.println("Unfortunately, you can't come in.");
            }
        }

    }
}
