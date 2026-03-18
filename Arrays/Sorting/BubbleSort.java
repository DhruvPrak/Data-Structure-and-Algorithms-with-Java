import java.util.Scanner;
class BubbleSort{
    public static void main(String args[]){
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
            int temp;
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n-1-i ; j++){
                    if(arr[i] < arr[j]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            System.out.print("Sorted Array : ");
            for(int i=0 ; i<n ; i++){
                System.out.print(arr[i]+" ");
            }
            t--;
        }
        sc.close();
    }
}