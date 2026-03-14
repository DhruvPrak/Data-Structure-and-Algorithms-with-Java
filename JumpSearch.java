/*Given an already sorted array of positive integers, design an algorithm and implement it using a
program to find whether a given key element is present in the sorted array or not. For an array
arr[n], search at the indexes arr[0], arr[2], arr[4],.....,arr[2k] and so on. Once the interval (arr[2k] <
key < arr[ 2k+1] ) is found, perform a linear search operation from the index 2k to find the element
key. (Complexity < O(n)) */
import java.util.Scanner;

public class JumpSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases : ");
        int t = sc.nextInt();
        while(t > 0){
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter sorted array elements:");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the number to be searched : ");
            int key = sc.nextInt();

            int i = 1;

            while(i < n && arr[i] < key){
                i *= 2;
            }

            int start = i / 2;
            int end = Math.min(i, n - 1);

            int f = 0;

            for(int j = start; j <= end; j++){
                if(arr[j] == key){
                    System.out.println("Element found at position : " + j+1);
                    f = 1;
                    break;
                }
            }

            if(f == 0)
                System.out.println("Element not found");

            t--;
        }

        sc.close();
    }
}