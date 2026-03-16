/*Given an unsorted array of positive integers, design an algorithm and implement it using a
program to find whether there are any duplicate elements in the array or not. (use sorting) (Time
Complexity = O(n log n)) */
import java.util.*;
class Que2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases :");
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            } 
            Arrays.sort(arr);
            int f=0;
            for(int i=0 ; i<n-1 ; i++){
                if(arr[i] == arr[i+1]){
                    f=1;
                    break;
                }
            }
            if(f==1){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        sc.close();
    }
}