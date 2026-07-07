import java.util.Scanner;

public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size]; //making an array object
        System.out.print("Enter array elements: ");
        for(int i = 0; i < size; i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}