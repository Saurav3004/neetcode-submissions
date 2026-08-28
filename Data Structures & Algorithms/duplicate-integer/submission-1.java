class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hasDuplicate = new HashSet<>();

        for(int i =0;i<nums.length;i++){
            if(hasDuplicate.contains(nums[i])){
                return true;
            }
            hasDuplicate.add(nums[i]);
        }
        return false;
    }
}