import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Annual Income: ");
        double annualIncome = scan.nextDouble();
        scan.nextLine();
        if (annualIncome <= 0) {
            System.out.println("Invalid Income!!");
            return;
        }
        System.out.println("Marital Statuts(Single , Married, Head of household): ");

        String maritalStatuts = scan.nextLine();
        switch (maritalStatuts) {
            case "Single":
                if (annualIncome <= 10000) {
                    System.out.print("Calculated Tax: $0");
                } else if (annualIncome <= 30000) {
                    double taxSingle1 = annualIncome * 0.10;
                    System.out.print("Calculated Tax: $" + taxSingle1);
                } else if (annualIncome <= 70000) {
                    double taxSingle2 = (annualIncome * 0.20) + 2000;
                    System.out.print("Calculated Tax: $" + taxSingle2);
                } else {
                    double taxSingle3 = (annualIncome * 0.30) + 10000;
                    System.out.print("Calculated Tax: $" + taxSingle3);
                }
                break;
            case "Married":
                if (annualIncome <= 10000) {
                    System.out.print("Calculated Tax: $0");
                } else if (annualIncome <= 30000) {
                    double taxMarried1 = (annualIncome * 0.10) -1000;
                    System.out.print("Calculated Tax: $" + taxMarried1);
                } else if (annualIncome <= 70000) {
                    double taxMarried2 = (annualIncome * 0.20) + 2000 -1000;
                    System.out.print("Calculated Tax: $" + taxMarried2);
                } else {
                    double taxMarried3 = (annualIncome * 0.30) + 10000 -1000;
                    System.out.print("Calculated Tax: $" + taxMarried3);
                }
                break;
            case "Head of household":
                if (annualIncome <= 10000) {
                    System.out.print("Calculated Tax: $0");
                } else if (annualIncome <= 30000 ) {
                    double taxHoh1 = (annualIncome * 0.10) - 2000;
                    System.out.print("Calculated Tax: $" + taxHoh1);
                } else if (annualIncome <= 70000) {
                    double taxHoh2 = (annualIncome * 0.20) + 2000 - 2000;
                    System.out.print("Calculated Tax: $" + taxHoh2);
                } else {
                    double taxHoh3 = (annualIncome * 0.30) + 10000 - 2000;
                    System.out.print("Calculated Tax: $" + taxHoh3);
                }
                break;
            default:
                    System.out.println("Invalid Status!");
        }
    }
    }