public class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        return moveZerosToRight(nums);
    }

    int[] moveZerosToRight(int[] arr){
        int l = 0;
        int r = 1;

        while(r < arr.length){
            if(arr[l] == 0 && arr[r] != 0){
                arr[l] = arr[r];
                arr[r] = 0;
                l++;
            }

            if(arr[l] != 0){
                l++;
            }

            r++;
        }

        return arr;
    }
}
