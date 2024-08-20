public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        comb(0, candidates, target, resultSet, new ArrayList<>(), 0);
        return new ArrayList<>(resultSet); // Convert Set back to List
    }

    private void comb(int i, int[] arr, int target, Set<List<Integer>> resultSet, List<Integer> ans, int sum) {
        if (sum == target) {
            resultSet.add(new ArrayList<>(ans)); // Add combination to Set
            return;
        }
        if (i >= arr.length || sum > target) {
            return;
        }

        // Include the current number
        ans.add(arr[i]);
        comb(i + 1, arr, target, resultSet, ans, sum + arr[i]);
        ans.remove(ans.size() - 1);

        // Skip duplicates
        while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            i++;
        }
        comb(i + 1, arr, target, resultSet, ans, sum);
    }
}