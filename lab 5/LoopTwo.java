
/**
 * @Laurel Woods 
 * @lab 5 9/9
 */
import java.util.Arrays;
public class LoopTwo
{
    private int[] nums;
    public LoopTwo(int n){
        nums = new int[n];
    }
    public void loadRandom() {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)((Math.random()* 10) + 1);
        }
    }
    public void sortArray(){
        Arrays.sort(nums);
    }
    public double findAverage() {
        int sum = 0;
        for(int k = 0; k < nums.length; k++) {
            sum = sum + nums[k];
        }
        return ((double)(sum)) /((double)(nums.length));
    }
    public String printArray(){
		String printList = "";
        for (int j = 0; j < nums.length; j++) {
			if((j + 1)% 10 == 0) {
				 printList = printList + nums[j] + "\n";
			}else {
					 printList = printList + nums[j] + "\t";
				}
        }
        return printList;
    }
}
