package Basics;
import java.util.*;
public class CountOperations {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            count++;
        }
        System.out.println("Number of operations = "+(count-1));
        System.out.println("Sum = "+sum);
    }
    
}
