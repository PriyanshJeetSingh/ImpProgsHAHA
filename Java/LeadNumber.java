import java.util.Scanner;

public class LeadNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nCopy=n;
        int oSum=0,eSum=0,r=0;
        while (n>0) {
             r=n%10;
             if(r%2==0){
                oSum=oSum+r;
            }else{
                eSum = eSum+r;
            n=n/10;
            }
            
        }if(eSum==oSum)
        {
            System.out.println("its a lead number");
        }else{
            System.out.println("its not a lead number");    
    }
    
    }
}

