class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int n = s.length();
        int ans=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right=0; right<n; right++){
            
                if(map.containsKey(s.charAt(right))){
                    map.put(s.charAt(right),map.get(s.charAt(right))+1);
                }else{
                    map.put(s.charAt(right),1);
                }

                int maxN=0;
                for(Integer num: map.values()){
                    maxN=Math.max(maxN,num);
                }

                int window=right-left+1;

                if(window-maxN <=k){
                     ans=Math.max(ans, window);
                }else{
                    map.put(s.charAt(left), map.get(s.charAt(left))-1);
                    left++;
                }
           
        }
        return ans;
    }
}
