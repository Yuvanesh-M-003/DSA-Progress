class Solution {
    public String convert(String s, int n) {
        if (n == 1 || n > s.length()) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new StringBuilder());
        }
        int index = 0;
        int direction = 0;
        for (char c : s.toCharArray()) {
            list.get(index).append(c);
            if (index == 0) {
                direction = 1;
            } else if (index == n - 1) {
                direction = -1;
            }
            index = index + direction;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder x : list) {
            result.append(x);
        }
        return result.toString();
    }
}