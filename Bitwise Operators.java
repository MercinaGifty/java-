package Operators;
public class Bitwise{
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        // 5 = 0101
        // 3 = 0011

        // AND
        System.out.println("AND: " + (a & b));

        // OR
        System.out.println("OR: " + (a | b));

        // XOR
        System.out.println("XOR: " + (a ^ b));

        // NOT
        System.out.println("NOT: " + (~a));

        // Left Shift
        System.out.println("Left Shift: " + (a << 1));

        // Right Shift
        System.out.println("Right Shift: " + (a >> 1));
    }
}
