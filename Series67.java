
import java.util.Scanner;
public class Series67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++){
                arr[j]=7*j;
                arr[j+1]=6*j;
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
    
}
