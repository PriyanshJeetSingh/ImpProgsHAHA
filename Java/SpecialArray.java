import java.util.Scanner;

/**
 * SpecialArray
 */
public class SpecialArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        System.err.println("Enter elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        

    }
}