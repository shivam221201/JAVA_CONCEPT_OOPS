 class volume{
                     double width;
                     double height;
                     double length;
                   }
public class vol_cube{
               public static void main(String[] args)
                 {
                  volume aps = new volume();
                  aps.width=10;
                  aps.length=20;
                  aps.height=15;

                  double vol;
                 vol= aps.width*aps.length*aps.height;

                 System.out.println("volume of cube is"+vol);
                }
             }
