class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> value = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int remainder = target - nums[i];
            if(value.containsKey(remainder)){
                int val = value.get(remainder);
                return new int[]{val,i};
            }else{
                value.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
