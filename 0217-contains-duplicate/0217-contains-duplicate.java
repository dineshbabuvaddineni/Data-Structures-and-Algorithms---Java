class Solution {
    public boolean containsDuplicate(int[] nums) {
         Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            if(!map.containsKey(a)){
                map.put(a,1);
            }else{
                map.put(a,map.get(a)+1);
            }
        }
        boolean answer=false;
        for(int key: map.keySet()){
            if(map.get(key)>1){
                answer=true;
                
            }
        }
        return answer;
        
    }
}