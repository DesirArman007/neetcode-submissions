class Solution {
    public int maxArea(int[] heights) {
        
        int ma=0;
        for(int i=0; i< heights.length; i++){
          int cm=0;
          for(int j=i+1; j< heights.length; j++){
            cm = (j-i) * Math.min(heights[i], heights[j]);
            ma=Math.max(cm,ma);
          }
        }

        return ma;
    }
}
