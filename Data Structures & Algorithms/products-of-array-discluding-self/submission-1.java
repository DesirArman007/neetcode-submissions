
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int totalProduct = 1;
        int zeroCount = 0;

        // Count zeros and calculate product of non-zero elements
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (zeroCount > 1) {
                res[i] = 0;
            }
            else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    res[i] = totalProduct;
                } else {
                    res[i] = 0;
                }
            }
            else {
                res[i] = totalProduct / nums[i];
            }
        }

        return res;
    }
}  
