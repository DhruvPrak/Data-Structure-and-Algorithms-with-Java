import java.util.Scanner;

public class MergeSort {

    static void merge(int arr[],int start,int mid,int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0 ; i<n1 ; i++){
            left[i] = arr[start+i];
        }
        for(int j=0 ; j<n2 ; j++){
            right[j] = arr[mid+1+j];
        }
        int i=0, j=0, k=start;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int arr[],int start,int end){
        if(start < end){
            int mid = start + (end - start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid +1, end);
            merge(arr, start, mid, end);
        }
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
            mergeSort(arr, 0, n-1);

            System.out.print("Sorted Array :");
            for (int num : arr){
                System.err.print(num+" ");
            }
            t--;
        }
    }
}