public class TestaPontoFlutuante {
    public static void main(String[] args){
        double salary;
        salary = 1250.70;
        System.out.println("My salary income is " + salary);

        double division;
        division = 3.14 / 2;

        System.out.println(division);

        int otherDivision;
        otherDivision = 5 / 2;
        System.out.println(otherDivision);

        double newOtherDivision;
        newOtherDivision = 5 / 2;
        System.out.println(newOtherDivision); //o resultado será 2.0 porque ele "arredonda" como se estivesse trabalhando com int.

        //para resolver esse problema, basta que 1 (um) dos operadores esteja em ponto flutuante.
        newOtherDivision = 5.0 / 2; //no caso, o operador ponto flutante será o 5 ou 5.0
        System.out.println(newOtherDivision);
    }
}
