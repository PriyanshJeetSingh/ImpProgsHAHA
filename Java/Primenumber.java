import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number:");
        int a = sc.nextInt();
        int k = 0;

        for (int i = 1; i <= a; i++) {
            if (a%i == 0) {
                k++;
            }
            
        }

        if(k==2)
            System.err.println("Its a prime no");
        else
            System.err.println("Its not a prime no.");

    }
}
