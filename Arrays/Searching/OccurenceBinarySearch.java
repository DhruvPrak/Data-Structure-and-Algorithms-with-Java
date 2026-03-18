/*Given a sorted array of positive integers containing few duplicate elements, design an algorithm
and implement it using a program to find whether the given key element is present in the array or
not. If present, then also find the number of copies of given key. (Time Complexity = O(log n))*/

import java.util.Scanner;

public class OccurenceBinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases :");
        int t = sc.nextInt();
        while(t>0){
            System.out.print("Enter the number of array :");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the number to be searched :");
            int key = sc.nextInt();
            t--;
        }
    }
}