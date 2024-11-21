 class Room {
    int length,breadth;
    Room(int a,int b)
    {
        length=a;
        breadth=b;
    }
    int area()
    {
        return(length*breadth);
    }
}
//Inheriting Room
class BedRoom extends Room
{
    int height;
    BedRoom(int a,int b,int c)
    {
        super(a,b);//pass values to superclass
        height=c;
    }
    int volume()
    {
        return(length*breadth*height);
    }
}
class InnerTest
        {
            public static void main(String []args)
         {
             BedRoom room1=new BedRoom(14,12,10);
             int area1=room1.area();//superclass method
             int volume1=room1.volume();//baseclass method
             System.out.println("Area1="+ area1);
             System.out.println("Volume1="+volume1);

         }
                }

