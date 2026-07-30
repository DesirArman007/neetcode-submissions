class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
                return 0;
            }
        Set<Character> set = new HashSet<>();

        int length=0,ans=0;
        int n = s.length();
        int l=0, r=0;        
        while(r<n){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
                length--;
            }
            set.add(s.charAt(r));
            length++;
            ans=Math.max(ans,length);
            r++;
        }

        return ans;
    }
}
