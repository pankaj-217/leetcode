

public class Solution {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // Empty prefix ka sum zero, ek baar
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            int required = prefixSum - k;

            count += map.getOrDefault(required, 0);

            map.put(
                prefixSum,
                map.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    
}