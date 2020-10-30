class A extends Thread
{
public void run()
{
for(int i=1;i<10;i++)
{
try
{
Thread.sleep(10);
System.out.println(i);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
public class CurrentThread
{
public static void main(String[] args) 
{
A obj1= new A();
A obj2= new A();
obj1.start();
obj2.start();
}
}


