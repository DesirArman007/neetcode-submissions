class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int n = temperatures.length;
        for(int i=0; i<n; i++){
            int temp = temperatures[i];
            int days=1;
            for(int j=i+1; j<n; j++){
                if(temp>temperatures[j]){
                    days+=1;
                }
                else if(temp<temperatures[j]){
                    result[i]=days;
                    break;
                }else{
                    days+=1;
                }
            }
        }
        return result;
    }
}
