import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter three integers representing the RGB values(0 to 255):");
        System.out.print("1. Red: ");
        int red = scan.nextInt();
        System.out.print("2. Green: ");
        int green = scan.nextInt();
        System.out.print("3. Blue: ");
        int blue = scan.nextInt();

        if( (red > 255 && green > 255 && blue > 255) || (red < 0 && green < 0 && blue < 0) )
        {
        System.out.println("invalid input");
        }
        else if ( red == green && green == blue )
        {
        System.out.println("Colors are equal in intensity.");
        }
        else if (red > green && red > blue && green != blue )
        {
        System.out.println("Dominant color: Red");
        }
        else if (green > red && green > blue && red != blue )
        {
        System.out.println("Dominant color: Green");
        } else if (blue > red && blue > green && green != red )
        {
        System.out.println("Dominant color: Blue");
        } else {System.out.println("No dominant color, two or more colors are equal and highest.");
        }

        }

    }