class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3){
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
           if(i>0 && nums[i-1] == nums[i]){
                continue;
           }      

           int left = i+1, right = nums.length-1;

           while(left < right){
             int currSum = nums[left]+nums[right] + nums[i];

             if(currSum > 0){
                right -=1 ;
             } else if ( currSum < 0){
                left +=1;
             } else{
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[left]);
                list.add(nums[right]);
                res.add(list);

                left+=1;
               while (nums[left]==nums[left-1] && left < right) {
                 left+=1;
               }

               right -=1;
               while (left < right && nums[right] == nums[right + 1]) {
                    right -=1;
                }
               } 

               
             }
           }      
        return new ArrayList<>(res);
    }
}
