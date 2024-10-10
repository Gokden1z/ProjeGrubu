/*
@author Sina Gökdeniz Gürgöze
@version 1.0
 */
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in);
 System.out.print("Day: ");
 int day = scan.nextInt();
 System.out.print("Month: ");
 int month = scan.nextInt();
 System.out.print("Year: ");
 int year = scan.nextInt();
if (day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
 System.out.println("You have entered a valid date.");
 }
else if (day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ) {
System.out.println("You have entered a valid date.");
}
else if (day == 28 && ( month == 2)) {
System.out.println("You have entered a valid date.");
}
else if (day == 29 && (( year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
System.out.println("You have entered a valid date.");
}
else { System.out.println("You have entered a invalid date.");
}}}