import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");
        int a = sc.nextInt();
        int m = a;
        a*=a;
        int sum = 0;

        while (a!=0) {
            int d = a%10;
                sum += d;
            a = a/10;
        }

        if ((sum == (m))) {
            System.err.println("Its a neon no.");
        }else{
            System.err.println("Its not a neon no.");
        }

    }
}
