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
class BinarySearchExample{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);     
 }  
}  

