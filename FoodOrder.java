import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Sandwich");

        System.out.print("Choose your food: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You ordered Pizza");
                break;

            case 2:
                System.out.println("You ordered Burger");
                break;

            case 3:
                System.out.println("You ordered Pasta");
                break;

            case 4:
                System.out.println("You ordered Sandwich");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
