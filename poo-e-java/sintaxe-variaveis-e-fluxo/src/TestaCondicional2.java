public class TestaCondicional2 {
        public static void main(String[] args) {
            System.out.println("Testing conditionals");
            System.out.println("---------------------");

            int age = 19;
            int quantidadePessoas = 3;

            /*
           if(age >= 18 || quantidadePessoas > 2){ //here we calling the boolean OR, so one of the conditions must be fulfilled
                System.out.println("Welcome!");
            }
                else {
                    System.out.println("You're underage.");
                    System.out.println("Unfortunately, you can't come in.");
                }

            if(age >= 18 && quantidadePessoas > 2){ //here we calling the boolean AND (both of conditions might exist)
                System.out.println("Welcome!");
            }
            else {
                System.out.println("You're underage.");
                System.out.println("Unfortunately, you can't come in.");
            }
            */

            boolean accompained = quantidadePessoas >= 2; //only accept true or false

            if (age >= 18 && accompained){
                System.out.println("Welcome!");
            }
            else {
                System.out.println("You're underage.");
                System.out.println("Unfortunately, you can't come in.");
            }
        }
}
