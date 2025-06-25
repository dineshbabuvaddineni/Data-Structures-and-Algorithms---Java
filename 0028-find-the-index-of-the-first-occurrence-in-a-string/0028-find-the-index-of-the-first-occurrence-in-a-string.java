class Solution {
    public int strStr(String haystack, String needle) {
        char[] arr=haystack.toCharArray();
        int start=haystack.length();
        int end=needle.length(); 

        for(int i=0;i<=start-end;i++){
            if(needle.equals(haystack.substring(i,i+end))){
                return i;
            }
        }

        return -1;
        
    }
}