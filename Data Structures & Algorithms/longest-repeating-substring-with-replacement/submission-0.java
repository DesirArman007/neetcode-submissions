class Solution {
    public int characterReplacement(String s, int k) {
                
        int n = s.length();
        int window=n;
        while(window>0){
            
            for(int start=0; start<=n-window; start++){
                HashMap<Character, Integer> map = new HashMap<>();

                for(int i=start; i<start+window; i++){
                    if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    }else{
                        map.put(s.charAt(i),1);
                    }
                }

                int max=0;
                for(Integer num : map.values()){
                    max=Math.max(max,num);
                }

                //check if valid or not
                if(window-max <= k){
                    return window;
                }
            } 
            window--;      
        }
    return 0;
    }
}
