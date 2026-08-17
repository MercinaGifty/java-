import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive Even number");
            } else {
                System.out.println("Positive Odd number");
            }
        } else {
            System.out.println("Number is not positive");
        }
    }
}
