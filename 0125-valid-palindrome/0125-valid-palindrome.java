class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String s1=s;
        boolean ispalin=true;
        int start=0;
        int end=s1.length()-1;
        while(start<end){
            if(s1.charAt(start)!=s1.charAt(end)){
                ispalin=false;
                break;
            }
            start++;
            end--;
        }
        return ispalin;
        
    }
}