import java.util.Scanner;

public class temp{ //one public class, if you make it private, it woudlnt allow

    public static String name = "Alex"; //public variable, if made private it willthrow an error
    public static void main(String args[]){ // if made private, you cannot call the main method anywhere
        newc.showname();
    }
}

class newc{
    public static void showname(){
        System.out.print(temp.name);
    }
}