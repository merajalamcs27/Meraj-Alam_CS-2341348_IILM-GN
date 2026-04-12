class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int max_count = 0;
        for(char c : s.toCharArray()){
            if(c == '(')counter++;
            if(c == ')')counter--;
            max_count = Math.max(counter,max_count);
        }
        return max_count;
    }
}
