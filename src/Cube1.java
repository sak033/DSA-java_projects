import java.sql.SQLOutput;

class Cube1 {
    int length;
    int breadth;
    int height;

    public int getVolume() {
        return (length * breadth * height);
    }

    Cube1() {
        length = 10;
        breadth = 10;
        height = 10;
    }

    Cube1(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public static void main(String[] args)
    {
        Cube1 CubeObj1, CubeObj2;
        CubeObj1=new Cube1();
        CubeObj2=new Cube1(10,20,30);
        System.out.println("volume of cube1 is:"+CubeObj1.getVolume());
        System.out.println("Volume of cube2 is:"+CubeObj2.getVolume());
    }
        }
