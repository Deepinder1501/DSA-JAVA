package Basics;

import java.util.Arrays;

public class InsertAnElement {
    //add an element 100 at index 3 of an array {1,2,3,5,6,7}
    public static void main(String[] args) {
        int arr[]={10,20,40,50,60};
        int element=30;

        int index=2;
        int n=arr.length;
        int newArr[]=new int[n+1];
        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        newArr[index]=element;
        for(int i=index;i<n;i++){
            newArr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}//time complexity= 0(N)
