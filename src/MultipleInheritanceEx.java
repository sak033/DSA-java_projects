import java.lang.*;

class one
{
   public void print_geeks()
   {
       System.out.println("greeks");
   }
}
class two extends one
{
    public void print_For()
    {
        System.out.println("For");
    }

}
class three extends two
{
    public void print_geeks()
    {
        System.out.println("geeks");
    }
}
public class MultipleInheritanceEx
{
    public static void main(String []args)
    {
        three g=new three();
        g.print_geeks();
        g.print_For();g.print_geeks();
    }
}