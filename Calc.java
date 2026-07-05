import java.util.Scanner;

public class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //we make an object from the scanner class, the object is sc, it will scan the input, thus System.in

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 =sc.nextInt();

        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        int choice = sc.nextInt();

        if (choice == 1){
            System.out.println("Sum: " + (num1 + num2));
        }
        else if (choice == 2){
            System.out.println("Difference: " + (num1 - num2));
        }
        else if (choice == 3){
            System.out.println("Product: " + (num1 * num2));
        }
        else if (choice == 4){
            System.out.println("Remainder: " + (num1 / num2));
        }

        sc.close();

    } 
}