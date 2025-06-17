import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        // long a1=Long.parseLong(a,2);
        // long b1=Long.parseLong(b,2);
        // long c= (a1+b1);
        // String ans=Long.toBinaryString(c);
        // return ans;

        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);
        BigInteger sum = a1.add(b1);
        return sum.toString(2);
        
    }
}