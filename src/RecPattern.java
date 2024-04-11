import java.util.Scanner;
public class RecPattern {
    public static void RecPattern(int n) {
        System.out.print(n + " ");

        if (n <= 0)
        {
            return;
        }

        RecPattern(n - 5);

        if (n > 0)
        {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        RecPattern(n);
    }


}