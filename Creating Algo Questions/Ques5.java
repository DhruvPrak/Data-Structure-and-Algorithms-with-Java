/*You have been given two sorted integer arrays of size m and n. Design an algorithm and
implement it using a program to find list of elements which are common to both. (Time
Complexity = O(m+n)) */
import java.util.*;
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int A[] = new int[m];
        for(int i = 0; i < m; i++){
            A[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int B[] = new int[n];

        for(int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;
        while(i < m && j < n) {
            if(A[i] == B[j]) {
                System.out.print(A[i] + " ");
                i++;
                j++;
            }
            else if(A[i] < B[j])
                i++;
            else
                j++;
        }
        sc.close();
    }
}