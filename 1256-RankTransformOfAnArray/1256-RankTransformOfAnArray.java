// Last updated: 7/29/2026, 6:00:17 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);

        Arrays.sort(temp);

        int rank = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int ele : temp) {
            if (!hm.containsKey(ele)) {
                hm.put(ele, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = hm.get(arr[i]);
        }

        return arr;
    }
}