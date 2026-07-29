// Last updated: 7/29/2026, 6:05:01 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, 0, res);
        return res;
    }

    private void permute(int[] nums, int i, List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> per = new ArrayList<>();
            for (int num : nums) per.add(num);
            res.add(per);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            permute(nums, i + 1, res);
            swap(nums, i, j); 
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}