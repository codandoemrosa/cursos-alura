public class TestaLacos {
    public static void main(String[] args) {
        for(int multiply = 1; multiply <= 10; multiply++){
            System.out.println("Tabuada do " + multiply);
            for(int count = 0; count <= 10; count++){
                System.out.println(count + " * " + multiply + " = " +multiply * count + " ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
