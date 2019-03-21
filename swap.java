import java.util.Scanner;
class swap
{
void func(int a,int b)
{
int temp=a;
a=b;
b=temp;
System.out.println("Values after swapping:\na="+a+" and b="+b);
}
public static void main(String[] args)
{
swap obj=new swap();
int a,b;
System.out.println("Enter the value of a and b:");
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
b=scan.nextInt();
System.out.println("Values before swapping:\na="+a+" and b="+b);
obj.func(a,b);
}
}


