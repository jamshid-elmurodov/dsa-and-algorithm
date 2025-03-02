public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = 0;

        while(r < nums.length){
            if(nums[l] == val && nums[r] != val){
                nums[l] = nums[r];
                nums[r] = val;
                l++;
            }

            if(nums[l] != val){
                l++;
            }

            r++;
        }

        return l;
    }
}
