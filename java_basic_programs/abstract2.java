abstract class bike
{
abstract void run();
}
class honda4 extends bike
{
void run()
{
System.out.println("running safely");
}
public static void main(String args[])
{
bike obj=new honda4();
obj.run();
}
}

