class Solution {
    public boolean hasDuplicate(int[] nums) {
        // using brute force 

        // if(nums.length < 2){
        //     return false;
        // }
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // using hashset

        Set<Integer> seen = new HashSet<>();
        for(int num: nums){
            if(seen.contains(num)){
                return true;
            }

            seen.add(num);
        } 
        return false;
    }
}