import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = scan.nextInt();
        if (number >= 100 && number <= 999) {
            Integer firstDigit = number / 100 % 10;
            Integer secondDigit = (number / 10) % 10;
            Integer thirdDigit = number % 10;
            Integer[] sub = {firstDigit, secondDigit, thirdDigit};
            Arrays.sort(sub);
            System.out.println("Digits smallest to largest: " + Arrays.toString(sub));

            Arrays.sort(sub, Collections.reverseOrder());
            System.out.println("Digits largest to smallest: " + Arrays.toString(sub));





        } else {
             System.out.println("Please enter a valid number");
               }


    }
}
