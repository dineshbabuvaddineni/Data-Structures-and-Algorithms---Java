import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
        Hashtable<Character,Integer> table=new Hashtable<>();
        int count=1;
        for(int i=0;i<arr.length;i++){
             if(table.containsKey(arr[i])){
                table.put(arr[i],table.get(arr[i])+count);
             }else{
                table.put(arr[i],count);
             }    
        }
        
        for(int i=0;i<arr.length;i++){
            if(table.get(arr[i])==1){
                return i;
            }
        }
        return -1;   
    }
}