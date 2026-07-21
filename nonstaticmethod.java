/*public class my{
    void meow(){
        System.out.print("Meow");
    }
}

class nonstaticmethod{
    public static void main(String a[]){
        my n = new my();
        n.meow();
    }
}*/

//not necessary that you have to make object in another class, you can make it within the class too

public class nonstaticmethod{
    String name;
    String course;
    String program;

    void getinfo(){
        name = "alex";
        course = "bca";
        program = "java";
        System.out.println("Name is: " + name);
        System.out.println("Course is: " + course);
        System.out.println("Program is: " + program);
    }


    public static void main(String a[]){
        nonstaticmethod myobject = new nonstaticmethod();
        myobject.getinfo();
    }
}