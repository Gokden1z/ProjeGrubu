import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner type =  new Scanner(System.in);
        int creditScore;
        double rate;
        System.out.print("Enter your credit score: ");
        creditScore = type.nextInt();
        if (creditScore > 850 || creditScore < 300) {
            System.out.println("Loan Denied.");
            return;
        }
        if(creditScore >= 800) {rate = 3;}
        else if (creditScore >= 750) {rate = 4;}
        else if (creditScore >= 700) {rate = 5;}
        else if (creditScore >= 650) {rate = 6;}
        else if (creditScore >= 600) {rate = 7;}
        else {System.out.println("Not eligible"); return;}


        double income;
        do
        {
            System.out.print("Enter your income: ");
            income = type.nextDouble();
            if (income < 0) {
                System.out.println("Income cannot be negative");
            }
        }while (income <= 0);

double loan;
        do
        {
            System.out.print("Enter your loan amount: ");
            loan = type.nextDouble();
            if (loan <= 0) {
                System.out.println("Loan Amount must be positive");
            }
        }while(loan <= 0);

        type.nextLine();
        String employmentStatus;
        System.out.print("Enter your employment status(Employed, Self-Employed," +
                " Unemployed, Student): ");
        employmentStatus = type.nextLine();

        double debts;
        do
        {
            System.out.print("Enter your existing debts: ");
            debts = type.nextDouble();
            if (debts < 0) {
                System.out.println("Debt cannot be negative");
            }
        } while (debts < 0);

       if(employmentStatus.equals("Employed") || employmentStatus.equals("Self-Employed")) {


               if (income < loan*2){
                   System.out.println("Loan Denied.");
                   return;
               }
               }

       if (debts / income >= 0.4) {
           System.out.println("Loan Denied.");
           return;
        }

        type.nextLine();
        String creditType;
        System.out.print("Enter your credit type(Home, Car, Personal, Education): ");
        creditType = type.nextLine();

     switch (creditType) {
     case "Home":
     if(employmentStatus.equals("Student") || employmentStatus.equals("Unemployed")) {
         System.out.println("Student and Unemployed only takes Education");
         return;
         }
     if(creditScore < 700 ) {
         System.out.println("Loan Denied.");
     }
      System.out.println("Assigned Interest Rate: "+ rate +"%");
      break;

     case "Car":
         if(employmentStatus.equals("Student") || employmentStatus.equals("Unemployed")) {
             System.out.println("Student and Unemployed only takes Education");
             return;
         }
     if(creditScore < 650 ) {
         System.out.println("Loan Denied.");
         return;
         }
         System.out.println("Assigned Interest Rate: "+ rate +"%");
         break;

     case "Personal":
         if(employmentStatus.equals("Student") || employmentStatus.equals("Unemployed")) {
             System.out.println("Student and Unemployed only takes Education");
             return;
         }
     if(creditScore < 620 ) {
     System.out.println("Loan Denied.");
     return;
     }
     rate = rate + 0.25;
     System.out.println("Assigned Interest Rate: "+ rate +"%");
     break;

     case "Education":
     if(employmentStatus.equals("Employed")) {
     rate = rate - 0.5;
     }
         System.out.println("Assigned Interest Rate: "+ rate +"%");
         break;

     case "Business":
         if(employmentStatus.equals("Student") || employmentStatus.equals("Unemployed")) {
             System.out.println("Student and Unemployed only takes Education");
             return;
         }
     if(creditScore < 680 ) {
     System.out.println("Loan Denied.");
     return;
     }
     if(creditScore < 750) {
     rate = rate + (0.5);
     }
     System.out.println("Assigned Interest Rate: "+ rate +"%");
     break;

     default:
     System.out.println("Not a valid credit type");
     }
    }
}