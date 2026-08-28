import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a ticket? (1 = Yes, 0 = No): ");
        int ticket = sc.nextInt();

        if (age >= 18) {

            if (ticket == 1) {
                System.out.println("You can enter the theatre.");
            } else {
                System.out.println("You need to buy a ticket.");
            }

        } else {

            if (ticket == 1) {
                System.out.println("You need an adult with you.");
            } else {
                System.out.println("You cannot enter without a ticket.");
            }
        }

        sc.close();
    }
}
