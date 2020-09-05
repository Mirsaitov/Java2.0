import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        double value = b / a;
        String Result = String.format("%.4f", value);
        System.out.print("Addition: " + Result);
    }
}
