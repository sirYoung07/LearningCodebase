package Algorithm;
public class CheckTwoSum {

    public int[] checkForTwoSum(int[] nums, int target){
        int loopCount =0;

        for (int i= 0; i < nums.length - 1 ; i++) {
            loopCount++;

            for(int j = i+1; j < nums.length ; j++){
                int sum = nums[i] + nums[j];
                System.out.println("Trying: " + nums[i] + " + " + nums[j] + " = " + sum);

                if( sum == target) {
                    System.out.println("found target");
                    System.out.println("[" + i + ", " + j + "]");
                    System.out.println("the sum of " + nums[i] + " and " + nums[j] + " gives " + target);
                    System.out.println("Total loops: " + loopCount);
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
