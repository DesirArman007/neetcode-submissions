class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for(String str: strs){

            char[] sChar = str.toCharArray();
            Arrays.sort(sChar);

            String nStr = new String(sChar);

            if(result.containsKey(nStr)){
                result.get(nStr).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                result.put(nStr, list);
            }

        }
        return new ArrayList<>(result.values());
        
    }
}
