class Solution {
    public int trap(int[] height) {
        
        if (height == null || height.length == 0) {
            return 0;
        }

        int n = height.length;
        int water=0;

        int[] maxLeft= new int[n];
        int[] maxRight= new int[n];

        maxLeft[0]=height[0];
        for(int j=1; j<n; j++){
            maxLeft[j] = Math.max(maxLeft[j-1], height[j]);
        }


        maxRight[n-1] = height[n-1];
        for(int j=n-2; j>=0; j--){
            maxRight[j] = Math.max(maxRight[j+1], height[j]);
        }


        for(int i=0; i<n; i++){
            water += Math.min( maxLeft[i], maxRight[i])-height[i];
        }

        return water;

    }
}
