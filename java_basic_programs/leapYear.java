import java.util.Scanner;

class leapYear {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    int y = scan.nextInt();
    
        if(y%400 == 0)
         System.out.println("leap year");
        else if(y%100 == 0 )
         System.out.println("not leap year");
        else if (y%4 == 0)
         System.out.println("leap year");
         
    }
}
