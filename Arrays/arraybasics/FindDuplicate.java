package arraybasics;
import java.util.Scanner;

class BruteForceSolution {
	
	public static int findDuplicate(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(i != j && arr[i] == arr[j]){
					return arr[i];
				}
			}
		}

		return Integer.MAX_VALUE;
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
		System.out.println("The Duplicate element in the Array is: " + duplicateNumber);
	}

	// Time complexity of this solution is: O(n^2)

}




class MostOptimalSolution {
	
	public static int findTheDuplicate(int arr[]) {
		int answer = 0;
		
		for(int i=0; i<arr.length; i++){
			answer = answer ^ arr[i]; // XOR of every element in the array
		}

		for(int j=0; j <= (arr.length - 2); j++){
			answer = answer ^ j; // XOR of elements in the range from 0 to (n-2)
		}
		

		return answer;
	}


	public static int[] takeInput() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = input.nextInt();
		}
		return arr;
	}


	public static void main(String[] args) {
		int[] arr = takeInput();
		int duplicateNumber = findTheDuplicate(arr);
		System.out.println();
		System.out.println("The duplicate element is: " + duplicateNumber);
	}

	// Time Complexity of this solution is: O(n)


}