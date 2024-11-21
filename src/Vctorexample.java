import java.util.*;
 class Vctorexample {
     public static void main(String args[])
     {
         Vector list=new Vector();
         list.addElement("Sakshi");
         list.addElement("Naresh");
         list.addElement("Kuthe");
         System.out.println("Vector Elements are:"+list);
         int size1=list.size();
         System.out.println(size1);

         list.insertElementAt("Kandri",3);
         System.out.println("Vector elements are:"+list);
         int size = list.size();
         System.out.println(size);
         list.removeElement("Kandri");
         System.out.println("Vector Element are:"+ list);
         list.removeElementAt(2);
         System.out.println("Vector Elements are:"+ list);

     }
}
