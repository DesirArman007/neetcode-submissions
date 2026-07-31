class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }

        int[] freqArray = new int[26];
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            freqArray[ch - 'a']++;
        }

        List<String> subStrings = new ArrayList<>();
        int i=0; 
        while(i <= s2.length()-s1.length()){
            subStrings.add(s2.substring(i, i+s1.length()));
            i++;
        }

       for (String s : subStrings) {

            int[] newfreq = Arrays.copyOf(freqArray, 26);

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                newfreq[ch - 'a']--;
            }

            boolean same = true;
            for (int num : newfreq) {
                if (num != 0) {
                    same = false;
                    break;
                }
            }

            if (same) {
                return true;
            }
        }

        return false;
    }
}
