class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int s = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(s<nums.length) {
            int correct = nums[s]-1;
            if(nums[s] != nums[correct]) {
                int temp = nums[s];
                nums[s] = nums[correct];
                nums[correct] = temp;
            } else {
                s++;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}