class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int a = 0;
        int b = 0;
        Stack<Integer> st = new Stack<>();
        for (int x : nums) {
            if (st.size() == 0) {
                st.push(x);
                a = Math.max(st.size(), a);

            } else if (st.size() != 0 && st.peek() < x) {
                st.push(x);
                a = Math.max(st.size(), a);

            } else if (st.peek() >= x) {
                a = Math.max(st.size(), a);
                while (st.size() != 0) {
                    st.pop();
                }
                st.push(x);
            }
        }
        while (st.size() != 0) {
            st.pop();
        }
        for (int x : nums) {
            if (st.size() == 0) {
                st.push(x);
                b = Math.max(st.size(), b);
            } else if (st.size() != 0 && st.peek() > x) {
                st.push(x);
                b = Math.max(st.size(), b);
            } else if (st.peek() <= x) {
                b = Math.max(st.size(), b);
                while (st.size() != 0) {
                    st.pop();
                }
                st.push(x);
            }
        }
        return Math.max(a, b);
    }
}