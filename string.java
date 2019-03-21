import java.util.Random;
public class randomstring
{
public static void main(String args[])
{
String[] myarray=new String[4];
myarray[0]="sentence 1";
myarray[1]="sentence 2";
myarray[2]="sentence 3";
myarray[3]="sentence 4";
Random random=new Random();
for(int i=0;i<4;i++)
{
int s1=random.nextInt(4);
//int s2=random.nextInt(4);
String temp= myarray[i];
myarray[i]=myarray[s1];
myarray[s1]=temp;
}
for(int i=0;i<4;i++)
{
System.out.println(myarray[i]);
}
}
}
