class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int ans=0;
        
        for(int i=0; i<n; i++){
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            int length=1;
            for(int j=i+1; j<n; j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                length++;
            }
            ans= Math.max(ans, length);
        }
    return ans;
    }
}
