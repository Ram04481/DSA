class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        for(String s : words){
            boolean flag = true;
            for(int i = 0; i < banned.length; i++){
                if(s.equals(banned[i])){
                    flag = false;
                }
            }
            if(flag) map.put(s, map.getOrDefault(s, 0) + 1);
        }
        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }
}