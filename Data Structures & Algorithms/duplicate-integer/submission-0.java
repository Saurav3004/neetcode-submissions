class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hasDuplicate = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(hasDuplicate.containsKey(nums[i])){
                return true;
            }
            hasDuplicate.put(nums[i],i);
        }
        return false;
    }
}