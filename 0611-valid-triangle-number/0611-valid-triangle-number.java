// import java.util.*;

// public class Solution {
//     public int triangleNumber(int[] nums) {
//         Map<String, Integer> memo = new HashMap<>();
//         return triangleNumber(nums, new ArrayList<>(), 0, memo);
//     }

//     private int triangleNumber(int[] nums, List<Integer> processed, int i, Map<String, Integer> memo) {
//         if (processed.size() == 3) {
//             int a = processed.get(0);
//             int b = processed.get(1);
//             int c = processed.get(2);
//             if (a + b > c && a + c > b && b + c > a) return 1;
//             return 0;
//         }

//         if (i == nums.length) return 0;

//         String key = i + "|" + processed.toString();
//         if (memo.containsKey(key)) return memo.get(key);

//         int count = 0;

//         processed.add(nums[i]);
//         count += triangleNumber(nums, processed, i + 1, memo);
//         processed.remove(processed.size() - 1);

      
//         count += triangleNumber(nums, processed, i + 1, memo);

//         memo.put(key, count);
//         return count;
//     }
// } 
import java.util.Arrays;

public class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) { 
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}
