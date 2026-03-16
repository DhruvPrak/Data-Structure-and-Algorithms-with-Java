import java.util.Scanner;
public class Ques3 {
    static int comp = 0;
    static int swap = 0;
    static int part(int arr[], int low, int high){
        int i = low - 1;
        int pivot = arr[high];
        for(int j=low ; j<high ; j++){
            comp++;
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swap++;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        swap++;
        return i;
    }

    static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pi = part(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases :");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("Enter the number elements in array :");
            int n = sc.nextInt();
            System.out.print("Enter the elements :");
            int arr[] = new int[n];
            for (int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            quickSort(arr, 0, n-1);
            for (int num : arr){
                System.out.print(num+" ");
            }
            System.out.println("Comparisons :"+comp);
            System.out.println("Swaps : "+swap);
        }
        sc.close();;
    }
}
