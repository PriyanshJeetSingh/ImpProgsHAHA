import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number.");
        int a = sc.nextInt();
        int m = a;
        int sum = 0;
        int prod = 1;

        while (a!=0) {
            int d = a%10;

            sum+=d;
            prod*=d;

            a = a/10;
        }

        if (sum == prod) {
            System.err.println("It is a spy no.");
        }else{
            System.err.println("It is not a spy no.");
        }

    }
}
