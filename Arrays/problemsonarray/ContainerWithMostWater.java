public class ContainerWithMostWater {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)

    public static int containerWithMostWater(int[] arr){
        int maxArea = 0;
        int area = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int height = Math.min(arr[i], arr[j]);
                area = (height * (j - i));
                if(area > maxArea){
                    maxArea = area;
                }
            }
            
        }
        return maxArea;
    }

    // Most Optimal Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int containerWithMostWaterMostOptimal(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        int water  = 0;

        while(i < j){
            int height = Math.min(arr[i], arr[j]);
            int width = (j - i);

            water = Math.max(water, (height * width));

            if(arr[i] < arr[j]){
                i++;
            } else{
                j--;
            }
        }

        return water;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        // int maximumArea = containerWithMostWater(arr);
        int maximumArea = containerWithMostWaterMostOptimal(arr);
        System.out.println(maximumArea);
    }
}
