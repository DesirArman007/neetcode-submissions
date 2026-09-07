class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> deque = new ArrayDeque();
        int[] res = new int[nums.length - k + 1];
        int resIndex = 0;


        for(int i=0; i<nums.length; i++){

            // checking and removing expired indices
            while( !deque.isEmpty() && deque.peekFirst() < i - k + 1){
                deque.pollFirst();
            }

            // check and remove small values from back
            while( !deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }

            // add in Deque
            deque.offerLast(i);

            //check window and put in result Array
            if( i >= k-1){
                res[resIndex++] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
