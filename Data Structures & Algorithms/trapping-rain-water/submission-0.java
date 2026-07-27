class Solution {
    public int trap(int[] height) {
         if (height == null || height.length == 0) {
            return 0;
        }
        int water=0;

        for(int i=0; i<height.length; i++){

            int maxLeft= height[i];
            int maxRight= height[height.length-1];

            for(int j=0; j<i; j++){
                maxLeft = Math.max(maxLeft, height[j]);
            }

            for (int j = i; j < height.length; j++){
                maxRight = Math.max(maxRight, height[j]);
            }

            water += Math.min(maxLeft, maxRight) - height[i];
            }
            return water;

        }

    }
