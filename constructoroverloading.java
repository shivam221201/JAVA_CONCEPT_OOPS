class Box{
         double width;
         double length;
         double height;

         //constructor used whwn all dimensions are specified

         Box(double w, double l, double h){
             width=w;
             height=h;
             length=l;
              }

          // constructors used when no dimensions are given

          Box(){
              width=1;
              height=1;
              length=1;
              }
          //constructor used when cube is created

         Box(double len){
              height=width=length=len;
                        }
          //compute and return volume
         double volume(){
              return width*length*height;
                        }
         }
public class constructoroverloading{
         public static void main(String[] args){
               //create boxes using various constructors
              Box mybox1= new Box(10,15,20);
              Box mybox2= new Box();
              Box mybox3= new Box(9);

              double vol;

              vol = mybox1.volume();
              System.out.println("volume is"+vol);

              vol = mybox2.volume();
              System.out.println("volume is"+vol);

              vol = mybox3.volume();
              System.out.println("volume is"+vol);

            }
   }
