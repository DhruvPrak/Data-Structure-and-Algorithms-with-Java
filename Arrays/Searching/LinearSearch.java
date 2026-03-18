/*Given an array of nonnegative integers, design a linear algorithm and implement it using a
program to find whether given key element is present in the array or not. Also, find total number
of comparisons for each input case. (Time Complexity = O(n), where n is the size of input)*/
import java.util.Scanner;
class LinearSearch{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases :");
        int t = sc.nextInt();
        for(int i=0 ; i<t ; i++){
            System.out.print("Enter the size of array :");
            int n = sc.nextInt();
            int arr []= new int[n];
            System.out.print("Enter element :");
            for(int j=0 ; j<n ; j++){
                arr[j] = sc.nextInt();
            }
            System.out.print("Enter the element to be search : ");
            int key = sc.nextInt();
            int f=0;
            for (int j=0 ; j<n ; j++){
                if(arr[i]==key){
                    f=1;
                }
            }
            if(f==1){
                System.out.println("Element found");
            }
            else{
                System.out.println("Element not found");
            }
        }
        sc.close();
    }
}