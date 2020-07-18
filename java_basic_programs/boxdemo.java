class Box{
                     double width;
                     double height;
                     double length;
                   }
public class Boxdemo{
               public static void main(String[] args)
                 {
                  Box aps = new Box();  //object1
                  Box bps = new Box();  //object2

                  aps.width=10;
                  aps.length=20;
                  aps.height=15;

                  bps.height=3;
                  bps.length=4;
                  bps.width=5;

                  double vol;
                 vol= aps.width*aps.length*aps.height;
                 System.out.println("volume of cube is"+vol);

                 vol= bps.width*bps.length*bps.height;
                 System.out.println("volume of cube is"+vol);
                }
             }





