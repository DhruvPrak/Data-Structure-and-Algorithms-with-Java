/*Given an unsorted array of integers, design an algorithm and implement it using a program to
find Kth smallest or largest element in the array. (Worst case Time Complexity = O(n)) */

import java.util.*;
public class Ques4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbe rof test cases :");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("Enter the size of an array : ");
            int n = sc.nextInt();
            System.out.print("Enter the elements : ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            Arrays.sort(arr);
            int i = 0;
            int j = n - 1;
            int f=0;
            while(i < j){
                int sum = arr[i] + arr[j];
                if(sum == k){
                    System.out.print(arr[i]+" "+arr[j]);
                    f=1;
                    break;
                }
                else if(sum < k){
                    i++;
                }
                else{
                    j--;
                }
            }
            if(f==0){
                System.out.print("No Such Element Exist");
            }
            sc.close();
        }
    }
}
