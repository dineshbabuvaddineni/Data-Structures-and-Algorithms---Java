class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num>0){
                int remainder=num%10;
                sum=sum+remainder;
                num=num/10;
            }
            num=sum;
        }
        return num;
        
    }
}