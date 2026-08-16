import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        if (username.equals("mercysam")) {
            System.out.println("Enter your password: ");
            String password = sc.nextLine();
            if (password.equals("samemi21")) {
                System.out.println("Login Successfully");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Incorrect username");
        }
    }
}
