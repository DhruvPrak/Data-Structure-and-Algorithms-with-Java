import java.util.Scanner;
public class InsertionSort {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number test cases :");
        int t = sc.nextInt();
        while(t-- >0){
            System.out.print("Enter the size of array :");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the element of array :");
            for(int i=0 ; i<n ;i++){
                arr[i] = sc.nextInt();
            }
            int comp = 0;
            int shifts = 0;
            for(int i=1 ; i<n ; i++){
                int k = arr[i];
                int j = i - 1;
                while(j >= 0 && arr[j]>k){
                    comp++;
                    arr[j+1] = arr[j];
                    shifts++;
                    j--;
                }
                if(j >= 0){
                    comp++;
                }
                arr[j+1] = k;
            }
            System.out.print("Sorted Array :");
            for (int num : arr){
                System.err.print(num+" ");
            }
            System.out.println("\nComprison : "+ comp);
            System.out.println("Shifts :"+shifts);
        }
        sc.close();
    }
}
