public class TesteSomatoria {
    public static void main(String[] args) {
        int count = 0;
        int total = 0;

        while(count <= 10){
            total = total + count;
            count++;
        }

        System.out.println(total);
    }
}
