public class my{
    void meow(){
        System.out.print("Meow");
    }
}

class nonstaticmethod{
    public static void main(String a[]){
        my n = new my();
        n.meow();
    }
}