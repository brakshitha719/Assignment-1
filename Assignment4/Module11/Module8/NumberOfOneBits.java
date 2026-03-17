package Assignment.Ass1and2.Assignment4.Module8;

//LeetCode 191 – Number of 1 Bits
public class NumberOfOneBits {
    public int hammingWeight(int n) {

        int ans = 0;

        for (int i = 0; i < 32; ++i)
            if (((n >> i) & 1) == 1)
                ++ans;

        return ans;
    }
}

