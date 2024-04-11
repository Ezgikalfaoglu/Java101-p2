import java.util.Scanner;
public class PowerRule {
    static void powerRule() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base of a number : ");
        int base = scanner.nextInt();
        System.out.print("Enter power of a number : ");
        int power = scanner.nextInt();
        System.out.println("The power of " + base + " is " + power + " =");
        int result=1;

        for (int i = 1; i < power; i++) {
            result = result * base;

        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        powerRule();

    }
}
