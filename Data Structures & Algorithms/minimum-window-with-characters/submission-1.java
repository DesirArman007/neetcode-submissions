class Solution {
    public String minWindow(String s, String t) {
        
        if(t.isEmpty()){
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char ch : t.toCharArray()){
            need.put(ch, need.getOrDefault(ch, 0)+1);
        }

        int left = 0;
        int have = 0;
        int needCount = need.size();
        int minLen = Integer.MAX_VALUE;
        int resStart = 0;
        
        for(int right = 0; right < s.length(); right++){

            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0)+1);
            if(need.containsKey(ch) && window.get(ch).equals(need.get(ch))) {
                    have++;
            }

            while(have == needCount){
                char leftChar = s.charAt(left);

                int windowLen = right - left + 1;

                if (windowLen < minLen) {
                    minLen = windowLen;
                    resStart = left;
                }

                window.put(leftChar, window.get(leftChar)-1);
                if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)) {

                    have--;
                }
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(resStart, resStart + minLen);
     
    }
}
