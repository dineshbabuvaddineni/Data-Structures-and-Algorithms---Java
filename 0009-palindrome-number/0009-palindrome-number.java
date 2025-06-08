class Solution {
    public boolean isPalindrome(int x) {
        int orig_num=x;
        int rev=0;
        // boolean flag=false;
        if(x<0){
            return false;
        }else{
              while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return rev==orig_num;

        }
        
    }
}