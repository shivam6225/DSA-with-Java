package questions;
import java.util.*;
public class FourSum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> list = new ArrayList<>();
            int n = nums.length;
            if (n < 4) return list;

            Arrays.sort(nums);

            for (int i = 0; i < n - 3; i++) {
                // Skip duplicate values for the first element
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                // Pruning 1: Smallest possible sum with nums[i] is already too large
                long min1 = (long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
                if (min1 > target) break;

                // Pruning 2: Largest possible sum with nums[i] is still too small
                long max1 = (long) nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3];
                if (max1 < target) continue;

                for (int j = i + 1; j < n - 2; j++) {
                    // Skip duplicate values for the second element
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                    // Pruning 1: Smallest possible sum with nums[i] is already too large
                    long min2 = (long) nums[i] + nums[j] + nums[j+1] + nums[j+2];
                    if (min2 > target) break;

                    // Pruning 2: Largest possible sum with nums[i] is still too small
                    long max2 = (long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2];
                    if (max2 < target) continue;

                    int left = j + 1;
                    int right = n - 1;

                    while (left < right) {
                        // Cast to long before adding to prevent 32-bit overflow
                        long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                        if (sum == target) {
                            list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                            // Advance pointers and skip duplicate elements
                            while (left < right && nums[left] == nums[left + 1]) left++;
                            while (left < right && nums[right] == nums[right - 1]) right--;

                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }

            return list;
        }
    }

}
