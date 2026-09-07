class Solution {
    public String minWindow(String s, String t) {
        
        int tMatch = 0;
        int win=t.length();
        while( win <= s.length()){
            
            for(int start=0; start <= s.length()-win; start++){

                String sub = s.substring(start,start+win);
                if(isValid(sub, t)){
                    return sub;
                }
                
            }
            win++;
        }
        return "";
    }
    public static boolean isValid(String sub, String target){
        int[] need= new int[128];
        int[] window= new int[128];

        for(char ch : target.toCharArray()){
            need[ch]++;
        }

        for(char ch : sub.toCharArray()){
            window[ch]++;
        }


        for(int i=0; i<128; i++){
            if(window[i] < need[i]){
                return false;
            }
        }

        return true;
        
    }
}
