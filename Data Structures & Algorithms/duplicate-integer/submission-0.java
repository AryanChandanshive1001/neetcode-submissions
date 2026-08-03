class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<>();


        for(int num :nums){
            if(!n.add(num)){
                return true;
            }
            
        }return false;
    }
}