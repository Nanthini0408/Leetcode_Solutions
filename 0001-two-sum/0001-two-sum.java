class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> h=new HashMap<>();
         int com=0;
         for(int i=0;i<nums.length;i++){
            com=target-nums[i];
            if(h.containsKey(com)){
                return new int[]{h.get(com),i};
            }
            h.put(nums[i],i);
         }
         return new int[]{};
    }
}