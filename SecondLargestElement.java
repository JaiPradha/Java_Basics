import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();   
        }

        if(n < 2){
            System.out.println("Not enough elements");
            return;
        }

        int largest = arr[0];
        int second = -1;
        int third = -1;

        
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] != largest) {
                if(second == -1 || arr[i] > second) {
                    second = arr[i];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] != second && arr[i] != largest) {
                if(third == -1 || arr[i] > third ) {
                    third = arr[i];
                }
            }
        }

        if(second == -1) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + second);
        }
        System.out.println(third);
    }
}
