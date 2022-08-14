import java.util.Arrays;

public class twoSum {
    static int[] tSum(int[] nums , int target){
        int n = nums.length;
        for(int i =0 ; i < n-1 ; i++) {
            for (int j = i+1;  j < n; j++) {
                int s = nums[i] + nums[j];
                if (s == target) {
                    int[] arr = {i, j};
                    System.out.println(Arrays.toString(arr));
                    return arr;
                }
            }
        }
        return null;
    }
}
