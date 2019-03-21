class myclass extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(Thread.currentThread().getId() + "value" + i);
}
}
}
public class CurrentThreadDemo
{
public static void main(String args[])
{
myclass myclass= new myclass();
myclass.start();
myclass myclass1=new myclass();
myclass1.start();
myclass myclass2= new myclass();
myclass2.start();
}
}
//System.out.println(Thread.currentThread().getID()+"value"+i);
