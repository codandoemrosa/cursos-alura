public class TestaValores {
    public static void main(String[] args) {
        //passagem por valor
        int firstNumber = 5;
        int secondNumber = 7;

        secondNumber = firstNumber;
        System.out.println(secondNumber);

        firstNumber = 10;
        System.out.println(secondNumber); //it doesn't change, because the attribution of secondNumber still linked to firstNumber's first value.
    }
}
