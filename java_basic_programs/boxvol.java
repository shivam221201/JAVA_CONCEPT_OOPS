class Box{
                     double width;
                     double height;
                     double length;

                     double volume(){
                      return  width*height*length; }
                     // set dimensions of box
                    void setdim(double w, double h, double l){
                           width=w;
                           length=l;
                           height=h;
                         }
                        }
public class BoxVol{
               public static void main(String[] args)
                 {
                  Box aps = new Box();  //object1
                  Box bps = new Box();  //object2

                  aps.setdim(3,4,5);
                  bps.setdim(10,20,30);
                  double vol;

                 vol=aps.volume();
                 System.out.println("volume of cube is"+vol);

                 vol= bps.volume();
                 System.out.println("volume of cube is"+vol);
                }
             }


