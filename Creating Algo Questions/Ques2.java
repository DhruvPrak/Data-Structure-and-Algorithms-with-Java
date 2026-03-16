/*Given an unsorted array of positive integers, design an algorithm and implement it using a
program to find whether there are any duplicate elements in the array or not. (use sorting) (Time
Complexity = O(n log n)) */
import java.util.Scanner;
class Ques2{
    static void merge(int arr[],int low,int mid,int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0 ; i<n1 ; i++){
            left[i] = arr[low+i];
        }
        for(int i=0 ; i<n2 ; i++){
            right[i] = arr[mid+1+i];
        }
        int i=0, j=0, k=low;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }k++;
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int arr[],int low,int high){
        if(low < end){
            int mid = (low + high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases :");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("Enter the number element in array :");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the elements :");
            for (int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int c = 0;
            for(int i=0 ; i<n ; i++){
                for(int j = i+1 ; j<n ; j++){
                    if(Math.abs(arr[i] - arr[j]) == k){
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}