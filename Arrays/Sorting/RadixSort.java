import java.util.Scanner;

public class RadixSort {
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    static void countingSort(int arr[], int n, int exp) {

        int output[] = new int[n];
        int count[] = new int[10];

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    static void radixSort(int arr[], int n) {

        int max = getMax(arr, n);

        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, n, exp);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases : ");
        int t = sc.nextInt();
        while(t>0){
            System.out.print("Enter the number elements in an array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the elements of the array : ");
            for (int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            radixSort(arr, n);
            System.out.print("Sorted Array :");
            for (int num : arr)
                System.out.print(num + " ");
            t--;
        } 
    }
}
