import java.util.*;
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {1,3,2,7,5,4};
        int minIndex = 0;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex= j;
                }
                
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            
            System.out.println(arr[j]);
            
        }
    }
}