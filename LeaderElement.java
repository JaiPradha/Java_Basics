import java.util.*;
public class LeaderElement
{
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int leader =arr[n-1];
        System.out.println(leader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>leader){
                leader=arr[i];
                System.out.println(leader);
            }
        }
    }
    
}
