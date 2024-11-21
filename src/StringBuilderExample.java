import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class StringBuilderExample {
    public static void main(String []args)
    {
        StringBuilder Obj1=new StringBuilder("Hi ");
        Obj1.append("My name is ");
        System.out.println("String 1="+Obj1.toString());
        StringBuilder Obj2=new StringBuilder("Sakshi");
        System.out.println("String 2="+Obj2.toString());
        StringBuilder Obj3=new StringBuilder(12);
        System.out.println("String 3="+Obj3.capacity());
        StringBuilder Obj4=new StringBuilder(Obj2.toString());
        System.out.println("String 4="+Obj4.toString());
    }

}
