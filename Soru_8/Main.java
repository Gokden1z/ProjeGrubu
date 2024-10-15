import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner type = new Scanner(System.in);

        int examScore;
        do
        {
            System.out.print("Enter exam score (0-100): ");
            examScore = type.nextInt();
            type.nextLine();
        }  while(examScore < 0 || examScore > 100);

        char result;
        if (examScore >= 90) { result = 'A'; }
        else if (examScore >= 80) { result = 'B'; }
        else if (examScore >= 70) { result = 'C'; }
        else if (examScore >= 60) { result = 'D'; }
        else { result = 'F'; }
        int attendance;
        do
        {
            System.out.print("Attendance(0% - 100%): ");
            String attendanceInput = type.nextLine();
            attendance = Integer.parseInt(attendanceInput.replaceAll("[^0-9]", ""));
        } while(attendance < 0 || attendance > 100);

        if (attendance < 75) {
            switch (result) {
            case 'A': result = 'B';
            break;
            case 'B': result = 'C';
            break;
            case 'C': result = 'D';
            break;
            case 'D': result = 'F';
            break;
            case 'F':
            break;}
        }

        String participation;
        do
        {
            System.out.print("Partcipation Level(Low, Medium, High):");
            participation = type.nextLine();
        } while(!participation.equals("Low") &&
                !participation.equals("High") &&
                !participation.equals("Medium"));

        switch (participation) {
            case "High":
                if (result != 'A') {
                    switch (result) {
                        case 'B':
                            result = 'A';
                            break;
                        case 'C':
                            result = 'B';
                            break;
                        case 'D':
                            result = 'C';
                            break;
                        case 'F':
                            result = 'D';
                            break;
                    }
                }
                break;
            case "Low":
                switch (result) {
                    case 'A':
                        result = 'B';
                        break;
                    case 'B':
                        result = 'C';
                        break;
                    case 'C':
                        result = 'D';
                        break;
                    case 'D':
                        result = 'F';
                        break;
                    case 'F':
                        break;
                }
                break;
            case "Medium":
                break;
            default:
                break;
        }

        System.out.println("Final Score: " + result);



    }
}