public class Array {
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[5] = 10;
        System.out.println(arr[5]);

        char cArray[] = new char[3]; // Arrays assign default value after declaration
        System.out.println(cArray[1]);

        double dArray[] = new double[5];
        System.out.println(dArray[4]); 

        System.out.println(dArray[5]); // ArrayIndexOutOfBoundException
    }
}
