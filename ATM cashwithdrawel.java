import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount <= balance) {

            if (amount % 100 == 0) {
                System.out.println("Cash withdrawn successfully.");
            } else {
                System.out.println("Amount should be in multiples of 100.");
            }

        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
