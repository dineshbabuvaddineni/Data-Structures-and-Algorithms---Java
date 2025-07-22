class Solution {
    public char findTheDifference(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Map<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<c1.length;i++){
            if(map1.containsKey(c1[i])){
                map1.put(c1[i],map1.get(c1[i])+1);
            }
            else{
                map1.put(c1[i],1);
            }
        }
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<c2.length;i++){
            if(map2.containsKey(c2[i])){
                map2.put(c2[i],map2.get(c2[i])+1);
            }
            else{
                map2.put(c2[i],1);
            }
        }

        for(Character k: map2.keySet()){
            int countT=map2.get(k);
            int countS=map1.getOrDefault(k,0);
            if(countT>countS){
                return k;
            }

        }
        return ' ';
        
    }
}