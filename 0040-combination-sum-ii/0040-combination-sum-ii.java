import java.util.*;

class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates); // sort array
        solve(candidates, target, 0, new ArrayList<>());
        return ans;
    }

    public void solve(int[] candidates, int target, int start, List<Integer> list) {
        
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // stop if element > target
            if (candidates[i] > target) break;

            list.add(candidates[i]);

            solve(candidates, target - candidates[i], i + 1, list);

            list.remove(list.size() - 1); // backtrack
        }
    }
}