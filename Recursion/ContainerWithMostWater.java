public class ContainerWithMostWater {

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
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int maximumArea = containerWithMostWater(arr);
        System.out.println(maximumArea);
    }
}
