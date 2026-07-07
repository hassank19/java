import java.util.Scanner;

public class array_operations{


    public static int min(int[] array, int size){
        int min = array[0];
        for (int i = 0; i < size; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }


    public static int max(int[] array, int size){
        int max = array[0];
        for (int i = 0; i < size; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }


    public static int find_avg(int[] array, int size){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum = sum + array[i];
        }
        int avg = ( sum / array.length); 
        return avg;
    }

    public static int find_sum(int[] array, int size){
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int choice;

        System.out.println("Enter an operation: ");
        System.out.println("1:: Find sum");
        System.out.println("2: Find average");
        System.out.println("3: Find max and min");
        choice = sc.nextInt();

        if (choice == 1){
            int sum = 0;
            sum = find_sum(arr, size);
            System.out.println(sum);
        }

        if (choice == 2){
            int avg;
            avg = find_avg(arr, size);
            System.out.println(avg);
        }
        if (choice == 3){
            int min = min(arr, size);
            int max = max(arr, size);
            System.out.print("Max:" + max);
            System.out.print("Min:" + min);
        }
        sc.close();
    }
}