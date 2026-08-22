public class SwitchString {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Red fruit");
                break;

            case "Banana":
                System.out.println("Yellow fruit");
                break;

            case "Orange":
                System.out.println("Orange fruit");
                break;

            default:
                System.out.println("Unknown fruit");
        }
    }
}
