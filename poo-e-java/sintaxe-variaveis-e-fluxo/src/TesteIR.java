public class TesteIR {
    //aliquota do IR
    //---------------- REGRAS -----------------
    //de 1,900.0 a 2,800.0 | IR = 7.5%
    //de 2,800.0 a 3,751.0 | IR = 15% | DDZ = 350.0
    //de 3,751.0 a 4,664.0 | IR = 22.5% | DDZ = 636.0

    public static void main(String[] args) {

        double salary = 3330.0;

        if(salary >= 1900.0 && salary <= 2800.0) {

            double irValue = (salary * 7.5) / 100;

            System.out.println("You may pay R$" + irValue + " in taxes.");

        } else if(salary >= 2801.01 && salary <= 3751.0) {

                double irValue = (salary * 15) / 100;
                double irRestitution = irValue - 350;

                System.out.println("You may pay R$" + irValue + ".");
                System.out.println("You got R$" + irRestitution + " in restitution from your taxes.");

        } else if(salary >= 3751.01 && salary <= 4664.0){

                double irValue = (salary * 22.5)/100;
                double irRestitution = irValue - 636;
                System.out.println("You may pay R$" + irValue + ".");
                System.out.println("You got R$" + irRestitution + " in restitution from your taxes.");
        }
    }
}
