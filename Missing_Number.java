import java.util.*;

class Missing_Number {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[i] + 1) { 
                num = nums[i] + 1;
                break;
            }
        }
        if (num == -1) {
            num = nums[nums.length - 1] + 1;
        }

        return num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Missing_Number obj = new Missing_Number();
        int result = obj.missingNumber(nums);

        System.out.print(result);

    }
}
