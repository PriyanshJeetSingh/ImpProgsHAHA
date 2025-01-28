import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a no.");
        int a = sc.nextInt();
        int m = a;
        int sum = 0;

        while (a!=0) {
            int d = a%10;
            
            sum+=d;

            a=a/10;
        }

        if (m%sum == 0) {
            System.err.println("Its a Harshad no.");
            
        }else{
            System.err.println("Its not a harshad no.");
        }


    }
}
