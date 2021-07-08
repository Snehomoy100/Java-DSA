import java.util.Scanner;


public class FindDuplicate {
	
	public static int findDuplicate(int arr[]){
		int ans;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i] == arr[j]){
					ans = arr[i];
				}
			}
		}

		return ans;
	}

	public static int[] takeInput() {
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        return arr;
	}




	public static void main(String[] args) {
		int[] arr = takeInput();
		int duplicateNumber = findDuplicate(arr);
		System.out.println(duplicateNumber);
	}
}