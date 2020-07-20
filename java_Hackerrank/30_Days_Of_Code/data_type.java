import java.io.*;
import java.util.*;


public class data_type {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int a= scan.nextInt();

        double b = scan.nextDouble();
         
        scan.nextLine();
        String str = scan.nextLine();

        int sum = i+a;
        
        double sum2 = d+b;
       
        
        System.out.println("" + sum);
        System.out.println("" + sum2);
        System.out.println(s + "" + str);

        
        scan.close();
    }
}
