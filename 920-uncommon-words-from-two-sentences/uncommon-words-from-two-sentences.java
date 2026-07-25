class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = s1.split(" ");
        String[] arr1 = s2.split(" ");
        for (String s : arr) {
            map.put (s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : arr1) {
            map.put (s, map.getOrDefault(s, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}