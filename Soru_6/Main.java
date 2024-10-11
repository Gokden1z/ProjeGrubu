import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a real number x: ");
        double x = scan.nextDouble();
        System.out.println("x = " + x);
        if (x <= 0) {
            double result1 = Math.pow(x, 2);
            System.out.println("f(" + x + ") = " + result1);
        } else if (x > 0 && x < 10) {
            double result2 = (2 * x + 1);
            System.out.println("f(" + x + ") = " + result2);
            } else  {
            double result3= (Math.pow(x, 3) - x);
            System.out.println("f(" + x + ") = " + result3);
            
        }


    }
}