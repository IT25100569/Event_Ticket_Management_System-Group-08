import java.util.Scanner;

public class V1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   Event Ticket Management System");
        System.out.println("=================================");

        System.out.print("Enter Event Name: ");
        String eventName = input.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = input.nextInt();

        System.out.println("\nEvent: " + eventName);
        System.out.println("Tickets Available: " + tickets);

        System.out.println("System Started Successfully!");
    }
}