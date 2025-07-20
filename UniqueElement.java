import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i]) && !duplicates.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                set.remove(arr[i]);  // Remove if it was already added once
                duplicates.add(arr[i]);  // Keep track of duplicates
            }
        }

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
