package UserInputScanner;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your slogan: ");
        String slogan = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        float percentage = sc.nextFloat();

        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Are you male? (true/false): ");
        boolean isMale = sc.nextBoolean();

        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.print("Enter a small number: ");
        byte smallNumber = sc.nextByte();

        System.out.print("Enter another number: ");
        short anotherNumber = sc.nextShort();


        System.out.println("\n--- Your Details ---");

        System.out.println("Name: " + name);
        System.out.println("Slogan: " + slogan);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Male: " + isMale);
        System.out.println("Phone: " + phone);
        System.out.println("Height: " + height);
        System.out.println("Small Number: " + smallNumber);
        System.out.println("Another Number: " + anotherNumber);

    }
}

