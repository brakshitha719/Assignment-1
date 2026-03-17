package Assignment.Ass1and2.Assignment4.Module11;

import java.util.ArrayDeque;
import java.util.Deque;

//LeetCode 239 – Sliding Window Maximum

public class SlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> maxQ = new ArrayDeque<>();

        for (int i = 0; i < nums.length; ++i) {
            while (!maxQ.isEmpty() && maxQ.peekLast() < nums[i])
                maxQ.pollLast();
            maxQ.offerLast(nums[i]);
            if (i >= k && nums[i - k] == maxQ.peekFirst()) // out-of-bounds
                maxQ.pollFirst();
            if (i >= k - 1)
                ans[i - k + 1] = maxQ.peekFirst();
        }

        return ans;
    }
}


