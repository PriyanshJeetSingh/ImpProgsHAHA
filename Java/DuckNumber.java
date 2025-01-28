import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a no.");
        int a = sc.nextInt();
        int k =0;

        while (a!=0) {
            if(a%10 == 0){
                k++;
            }

            a = a/10;
        }

        if (k>=1)
            System.err.println("Its a duck no.");

        else
            System.err.println("Not a duck no.");
    }
}
