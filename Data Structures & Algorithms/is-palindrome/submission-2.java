class Solution {
    public boolean isPalindrome(String s) {
        int[] count = new int[26];
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0; i<cleaned.length()/2; i++){
            char c1 = cleaned.charAt(i);
            char c2 = cleaned.charAt(2*cleaned.length()/2-i-1);

            if(c1!=c2){
                return false;
            }

        }
       return true;
    }
}
