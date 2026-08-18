import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.print("Do you have a voter ID? (1 for Yes, 0 for No): ");
            int id = sc.nextInt();

            if (id == 1) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You need a voter ID.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
