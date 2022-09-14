public class TestaCaracteres {
    public static void main(String[] args) {
        char letter = 'a'; //char only works with 1 character
        System.out.println(letter);

        char unicode = 256; //it works because each character we see in screens is a symbol that have a correspondent number in ASCII and unicode.
        System.out.println(unicode);

        String alura = "Alura: Online tecnology courses. ";
        System.out.println(alura);

        alura = alura + 2022;
        System.out.println(alura);
    }
}
