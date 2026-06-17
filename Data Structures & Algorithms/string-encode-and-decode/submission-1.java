class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()) return "";
    
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            int sLen = str.length();
            String del = "#";
            sb.append(sLen+del+str);
        }

        System.out.println(sb.toString());
    return sb.toString();
    }

    public List<String> decode(String str) {

        if(str.length()==0){
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        int i=0;
        while(i < str.length()){
            int j=i;
            while( str.charAt(j) != '#'){
                    j += 1;
            }
            int sLen = Integer.parseInt(str.substring(i, j));
             
            String decoded_Str = str.substring(j+1 , j + 1 + sLen);
            res.add(decoded_Str);
            i = j + 1 + sLen; 
        }

    return res;
    }
}
