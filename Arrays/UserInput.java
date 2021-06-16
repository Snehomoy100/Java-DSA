import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter the element at " + i + "th position: ");
            arr[i] = input.nextInt();
        }

        System.out.println("Your array is: ");


        
        for(int j=0; j<n; j++){
            System.out.println(arr[j]);
        }

        input.close();
    }
}