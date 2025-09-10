public class MaxFinder {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 6, 23, 99, 34};
        System.out.println("Finding the maximum number with a Recursion...");

        System.out.println("The maximum number is: " + findMaxRecursive(numbers,0));
    }
    public static int findMaxRecursive(int[] nums, int index){
       int max=0;
       if(index==nums.length-1){
           return nums[index];
       }
          max= findMaxRecursive(nums,  index+1) ;

        if(max>nums[index]){
            return max;
        }
      return nums[index];
    }
}

