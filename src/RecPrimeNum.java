import java.util.Scanner;

public class RecPrimeNum {
    static void recPrimeNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++){

            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && n>1){
                System.out.println(n + " is a prime number.");
                break;
            }else {
                System.out.println(n + " is not a  prime number.");
                break;
            }
        }


    }
    public static void main(String[] args) {
        recPrimeNum();

    }
}