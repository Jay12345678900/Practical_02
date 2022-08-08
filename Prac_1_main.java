import java.util.Scanner;

public class Prac_1_main {
    public static void main(String[] args) {
        Prac_1 object1 = new Prac_1();

        System.out.print("Enter The Argument for Radius: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        Prac_1 object2 = new Prac_1(a);

        System.out.println("Area and Perimeter of Circle for default argument 1: "+object1.getArea()+" and "+object1.getPerimeter());
        System.out.println("Area and Perimeter of Circle for argument  " + a + ": "+object2.getArea()+" and "+object2.getPerimeter());

        System.out.println("Made by: 21CE092_Jay");
    }
}
