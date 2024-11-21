

/*Mammal.java*/
interface Animal{
      abstract void eat();
      abstract void  travel();
}
 class Mammal implements Animal{
     public void eat() {
         System.out.println("mammal eats");
     }


     public void travel() {
         System.out.println("mammal travels");
     }



     public static void main(String args[]){
         Mammal m=new Mammal();
         m.eat();
         m.travel();
     }
}