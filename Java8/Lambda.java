interface Hello{

    void sayHello();

}

public class Lambda{

    public static void main(String[] args){

        Hello h=()->System.out.println("Hello Java");

        h.sayHello();

    }

}
