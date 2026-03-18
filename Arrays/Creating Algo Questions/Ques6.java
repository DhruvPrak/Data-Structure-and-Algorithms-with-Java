/*Given a sorted array of positive integers, design an algorithm and implement it using a program
to find three indices i, j, k such that arr[i] + arr[j] = arr[k].*/
import java.util.Scanner;
public class Ques6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases :");
        int t = sc.nextInt();
        while(t>0){
            System.out.print("Enter the size of array :");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the elements of array :");
            for (int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int f=0;
            for (int i=0 ; i<n && f==0; i++){
                for (int j=i+1 ; j<n && f==0; j++){
                    for (int k=j+1 ; k<n ; k++){
                        if (arr[i]+arr[j] == arr[k]){
                            f=1;
                            System.out.print(i+1+", "+j+1+", "+k+1);
                            break;
                        }
                    }
                }
            }
            if (f==0){
                System.out.print("No sequence found");
            }
            t--;
        }

    }
}
