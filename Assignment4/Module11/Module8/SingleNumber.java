package Assignment.Ass1and2.Assignment4.Module8;

//LeetCode 136 – Single Number using XOR
public class SingleNumber {
    public int singleNumber(int[] nums) {

        int ans = 0;

        for (final int num : nums)
            ans ^= num;

        return ans;
    }
}
