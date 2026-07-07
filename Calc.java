import java.util.Scanner;

public class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //we make an object from the scanner class, the object is sc, it will scan the input, thus System.in

        while (true) {
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 =sc.nextInt();

        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Exit");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Sum is: " +  (num1 + num2));
                break;
            case 2:
                System.out.print("Difference is " + (num1 - num2));
                break;
            case 3:
                System.out.print("Multiplication is " + (num1 * num2));
                break;
            case 4:
                System.out.print("Division is " + (num1 / num2));
                break;
            case 5:
                sc.close();
                return;
            default:
                System.out.print("Invalid input");

        }
    }
    } 
}