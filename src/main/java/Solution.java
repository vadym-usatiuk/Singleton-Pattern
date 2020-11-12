class Solution {
    public String str;

    private Solution() {
    }

    private static Solution pattern;

    public static Solution getSingleInstance() {
        if (pattern == null) {
            pattern = new Solution();
        }
        return pattern;
    }
}