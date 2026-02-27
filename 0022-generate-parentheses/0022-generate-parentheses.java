class Solution {
    public List<String> generateParenthesis(int n) {
       ArrayList<String> result = new ArrayList<>();
       Generate(result,"",n,n);
       return result; 
    }

    void Generate(List<String> result,String s,int left,int right){
        if(left == 0 && right == 0){
            result.add(s);
            return;
        }

        if(left > 0){
            Generate(result, s + "(", left - 1, right);
        }

        if(right > left){
            Generate(result, s + ")", left, right - 1);
        }
    }
}