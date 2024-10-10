import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a five-digit number:");
        String str = scan.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        if(str.equals(str1.toString())) {
            System.out.println("Palindrome ");
        }
        else {
            System.out.println("Not a palindrome ");
        }


    }
}