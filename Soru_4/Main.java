import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("enter a four-digit integer: ");
        Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      if (num >= 1000 && num <=9999 ) {
        int digitOne = num / 1000 % 10;
        int digitTwo = num / 100 % 10;
        int digitThree = num / 10 % 10;
        int digitFour = num % 10;
        int product =  (digitOne * digitTwo * digitThree * digitFour);
        int sum = (digitOne + digitTwo + digitThree + digitFour );

        System.out.println("product:" + product);
        System.out.println("sum:" + sum);
        if (sum == product) {
            System.out.println("Sum and product are equal.");
            } else if (sum > product) {
            System.out.println("Sum is greater than product.");}
            else {
            System.out.println("Product is greater than the sum.");}
    } else
    System.out.println("Not a valid number.");
    }
}