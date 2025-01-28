import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number:");
        int a = sc.nextInt();
        int m = a;
        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (a%i == 0) {

                sum+=i;

            }
            
        }

        if(sum>m)
            System.err.println("Its a abundant no");
        else
            System.err.println("Its not a abundant no.");

    }
}
