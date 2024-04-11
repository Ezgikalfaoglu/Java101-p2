import java.util.Scanner;
public class Calculator {

    static void plus(){
        Scanner scanner= new Scanner(System.in);
        int number, result=0, i=1;
        while (true){
            System.out.print(i++ + ". number :");
            number= scanner.nextInt();
            if (number==0){
                break;
            }
            result+=number;
        }
        System.out.println("Result: " +result);
    }
    static void minus(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many numbers do you want to minus:  ");
        int counter= scanner.nextInt();
        int number, result=0;

        for (int i=1;i<=counter;i++){
            System.out.print(i++ + ". number :");
            number= scanner.nextInt();
            if (number==1){
                result+=number;
                continue;
            }
            result-=number;
        }
        System.out.println("Result: " +result);
    }

    static void times(){
        Scanner scanner= new Scanner(System.in);
        int number, result=1, i=1;

        while (true){
            System.out.print(i++ + ". number :");
            number= scanner.nextInt();

            if (number==1) {
                break;
            }

                if (number==0){
                    result=0;
                    break;
                }
                result*=number;
        }
        System.out.println("result: " + result);
    }

    static void divided(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("How many numbers do you want to divide:  ");
        int counter= scanner.nextInt();
        double number, result=0.0;

        for (int i=1;i<=counter;i++){
            System.out.print(i++ + ". number :");
            number= scanner.nextDouble();
            if (i!=1 && number==0){
                System.out.println("You cannot enter the dividing for zero");
                continue;
            }
            if (i==1){
                result=number;
                continue;
            }
            result/=number;
        }
        System.out.println("result: " + result);
    }
    static void power(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the base value:  ");
        int number= scanner.nextInt();
        int base=scanner.nextInt();
        System.out.print("Enter the exponent:  ");
        int exponent= scanner.nextInt();
        int result=1;

        for (int i=1;i<=exponent;i++){
            result*=number;
        }
        System.out.println("result: " + result);
    }
    static void factorial(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int number= scanner.nextInt();
        int result=1;

        for (int i=1;i<=number;i++){
            result*=i;
        }
        System.out.println("result: " + result);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int select;
        String menu= "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Power\n"
                + "6- Factorial\n"
                + "7- Exit";

        do {
            System.out.println(menu);
            System.out.print("Enter your choice:  ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                    case 2:
                        minus();
                        break;
                        case 3:
                            times();
                            break;
                            case 4:
                                divided();
                                break;
                                case 5:
                                    power();
                                    break;
                                    case 6:
                                        factorial();
                                        break;
                                        case 7:
                                            break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (select != 7);
    }

}
