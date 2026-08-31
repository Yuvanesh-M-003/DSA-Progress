class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> map = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            map.offer(nums[i]);
        }
        for(int i=1; i<k;i++)
        {
            map.poll();
        }
        return map.peek();
    }
}