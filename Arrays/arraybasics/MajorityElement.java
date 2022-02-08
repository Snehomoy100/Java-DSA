package arraybasics;


class MajorityElementMostOptimal{
    public static void main(String[] args) {
        
    }
}



class MajorityElementBruteForce {

    // Brute-Force solution

    // T.C -> O(n^2)
    // S.C -> O(1)
    
    
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
        int[] nums = {5};
        int majorityElementIs = majorityElement(nums);
        System.out.println(majorityElementIs);
    }
}


