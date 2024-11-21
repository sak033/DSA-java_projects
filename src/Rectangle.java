 class Rectangle{
    int length,width;
    Rectangle(int a, int b)
    {
        length=a;
        width=b;

    }

     int RectangleArea() {
         return (length * width);
     }
 }

class RectangleArea
{
    public static void main(String[]args)
    {
        Rectangle R1=new Rectangle(15,11);
        int area1=R1.RectangleArea();
        System.out.println("Area1="+area1);
    }
}