class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1=new HashSet<>();
        for(int ele1: nums1){
            set1.add(ele1);
        }

        Set<Integer> resultSet=new HashSet<>();
        for(int ele2:nums2){
            if(set1.contains(ele2)){
                resultSet.add(ele2);
            }
        }
       
        int[] result=new int[resultSet.size()];
        int i=0;
        for(int ele3: resultSet){
            result[i++]=ele3;

        } 
        return result; 
    }
}