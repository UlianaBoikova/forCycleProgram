import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input grades: ");
        double number = in.nextDouble();
        double max = number;
        double min = number;
        double total = number;
        for (int i = 1; i <= 9; i++) {
            if (number > max) max = number;
            if (number < min) min = number;
            total += number;
            number = in.nextDouble();
        }
        System.out.println("Average number: " + (total / 10));
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}