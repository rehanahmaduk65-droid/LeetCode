class Solution {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";
        
        String prefix = strs[0]; // assume first string as prefix
        
        for (int i = 1; i < strs.length; i++) {
            // reduce prefix until it matches the start of current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // if prefix becomes empty → no common prefix
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
    }
}
