import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        double price;
        do
        {
            System.out.print("Base Price: ");
            price = type.nextDouble();
            type.nextLine();
            if (price <= 0) {
                System.out.println("Price must be positive. Please enter a valid price.");
            }
        } while (price <= 0);
        String membership;
        do
        {
            System.out.print("Membership Level(Bronze, Silver, Gold, Platinum): ");
            membership = type.nextLine();
        } while (!membership.equals("Bronze") &&
                !membership.equals("Silver") &&
                !membership.equals("Gold") &&
                !membership.equals("Platinum"));
        price = switch (membership) {
            case "Bronze" ->
                    price * 0.95;
            case "Silver" ->
                    price * 0.90;
            case "Gold" ->
                    price * 0.85;
            case "Platinum" ->
                    price * 0.80;
            default ->
                    price;
        };

        String userTimeInput;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm"); //???

        System.out.print("Purchase Time(HH:mm):");
        userTimeInput = type.nextLine();

        LocalTime startNightDiscount = LocalTime.of(0, 0);
        LocalTime endNightDiscount = LocalTime.of(6, 0);
        LocalTime startNoonDiscount = LocalTime.of(12, 0);
        LocalTime endNoonDiscount = LocalTime.of(14, 0);

        LocalTime userTime = LocalTime.parse(userTimeInput, timeFormatter);

        if (!userTime.isBefore(startNightDiscount) && userTime.isBefore(endNightDiscount)) {
            price = price * 0.90;
        } else if (!userTime.isBefore(startNoonDiscount) && userTime.isBefore(endNoonDiscount)) {
            price = price * 0.95;
        }
        String category;
        do
        {
            System.out.print("Select Category(Electronics, Clothing, Groceries, " +
                    " Books, Furniture): ");
            category = type.nextLine();
        } while (!category.equals("Electronics") &&
                !category.equals("Clothing") &&
                !category.equals("Groceries") &&
                !category.equals("Books") &&
                !category.equals("Furniture"));

        price = switch (category) {
            case "Electronics" ->
                    price * 1.03;
            case "Clothing" ->
                    price * 0.95;
            case "Books" ->
                    price * 0.97;
            case "Furniture" ->
                    price * 1.07;
            default ->
                    price;
        };

        String season;
        do
        {
            System.out.print("Select Season(Spring, Winter): ");
            season = type.nextLine();
        } while (!season.equals("Spring") && !season.equals("Winter"));

        if (season.equals("Spring") && (category.equals("Clothing") || category.equals("Furniture"))) {
        price = price * 0.95;
        }
        if (season.equals("Winter") && category.equals("Electronics")) {
        price = price * 0.90;}

        System.out.printf("%.2f", price);

    }

}