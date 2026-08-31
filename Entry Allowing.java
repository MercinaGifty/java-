import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {

            System.out.print("Do you have an ID? (yes/no): ");
            String id = sc.next();

            if (id.equals("yes")) {
                System.out.println("Entry allowed 🎬");
            } else {
                System.out.println("Entry denied - ID required.");
            }

        } else {
            System.out.println("Entry denied - You must be 18+.");
        }
    }
}
