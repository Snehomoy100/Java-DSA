package arraybasics;

public class MajorityElement {

    // Brute-Force solution
    
    public static int majorityElement(int[] nums) {
        int majorityCounter = (nums.length/2);
        for(int i : nums){
            int counter = 0;
            for(int j : nums){
                if(i == j){
                    counter += 1;
                }
            }
            
            if(counter > majorityCounter){
                return i;
            }
            
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int majorityElementIs = majorityElement(nums);
        System.out.println(majorityElementIs);
    }
}
