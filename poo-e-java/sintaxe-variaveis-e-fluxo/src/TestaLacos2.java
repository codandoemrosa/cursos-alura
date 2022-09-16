public class TestaLacos2 {
    public static void main(String[] args) {
        for(int row = 0; row < 10; row++){
            for(int column = 0; column <= row; column++){
                //if(column > row)
                    //break;
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
