import java.util.*;

class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        solve(nums, used, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> ans) {
        
        // base case
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) continue;

            // choose
            used[i] = true;
            list.add(nums[i]);

            // explore
            solve(nums, used, list, ans);

            // backtrack
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}