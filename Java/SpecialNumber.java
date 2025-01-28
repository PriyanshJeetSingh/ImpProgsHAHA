import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number.");
        int a = sc.nextInt();
        int m = a;
        int sum = 0;
        int prod = 1;
        int k = 0;


        while (a!=0) {
            int d = a%10;

            sum+=d;
            prod*=d;

            a = a/10;
        }
        
        k = sum+prod;

        if (k == m) {
            System.err.println("It is a special no.");
        }else{
            System.err.println("It is not a special no.");
        }

    }
}
