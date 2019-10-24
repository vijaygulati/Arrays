package Lec_4_Functions;

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array elements");
        int []arr1=new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the element you wanna search");
        int element=s.nextInt();
        System.out.println(bin_search(arr1,element));
    }

    public static int bin_search(int[] arr1, int element) {
        int start=0;
        int end=arr1.length-1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (arr1[mid]==element){
                return mid;
            }
            if(element>mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

}
