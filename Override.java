class A{
       private int a;
       private int b;
               int c;
       void print(int a, int b)
          {
           System.out.println("print"+a+ ""+b);
          }
}

class B extends A{
            void print(int a,int b,int c){
                  super.print(10,20);
                  System.out.println("print"+c);
                  }
                }
public class Override
          {
       public static void main(String[] args){

       B obj = new B();
        obj.print(10,20,30);
          }


}
