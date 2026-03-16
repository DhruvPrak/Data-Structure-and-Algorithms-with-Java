import java.util.Scanner;
public class Ques1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
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