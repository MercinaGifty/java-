public class LogicalOperators {
    public static void main(String[] args) {

        int age = 20;
        int mark = 80;

        // Logical AND &&
        System.out.println("AND: " + (age >= 18 && mark >= 50));

        // Logical OR ||
        System.out.println("OR: " + (age >= 18 || mark >= 90));

        // Logical NOT !
        boolean isStudent = true;
        System.out.println("NOT: " + (!isStudent));
    }
}
