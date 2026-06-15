class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] countFreq = new int[26];

        for(int i=0; i<s.length(); i++){
            countFreq[s.charAt(i) - 'a']++;
            countFreq[t.charAt(i) - 'a']--;
        }

        for(int num: countFreq){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
