import java.util.Scanner;
public class QuickSort{
    static int part(int arr[], int low, int high){
        int idx = low - 1;
        int pivot = arr[high];
        for (int j = low ; j < high ; j++){
            if(arr[j] <= pivot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[high];
        arr[high] = temp;
        return idx ;
    }
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = part(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases :");
        int t = sc.nextInt();
        while(t>0){
            System.out.print("Enter the number of elements in array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Etner the elements in an arrar : ");
            for (int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            quickSort(arr, 0, n-1);
            for(int num : arr) System.out.print(num+" ");
            t--;
        }
        sc.close();
    }
}