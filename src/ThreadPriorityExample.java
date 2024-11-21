class c extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class D
{
    public static void main(String args[])
    {
        c t1=new c();
        c t2=new c();
        c t3=new c();

        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t1.setPriority(10);
        t2.setPriority(6);
        t3.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
    }
}