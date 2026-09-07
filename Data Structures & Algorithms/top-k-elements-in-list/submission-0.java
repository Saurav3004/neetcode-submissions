class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(k == nums.length){
            return nums;
        }

       Map<Integer,Integer> count = new HashMap<>();

       for(Integer num:nums){
        if(count.containsKey(num)){
            int val = count.get(num);
            count.replace(num,val,++val);
        }else{
            count.put(num,1);
        }
       }

       List<Map.Entry<Integer, Integer>> entries =
        new ArrayList<>(count.entrySet());
       entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
       int[] result = new int[k];

for (int i = 0; i < k; i++) {
    result[i] = entries.get(i).getKey();
}

return result;
    }
}
