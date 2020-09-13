/******************************************************************************

                           
 Input 3 hai
 Toh output
 3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $

*******************************************************************************/
import java.util.Scanner;
public class numberPattern
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
	    for (int x=n; x>0; x-- ){ 
		System.out.print(" $ ");
		    for(int y=n; y>0; y--){
		        int z =x;
		        while(z>0){
		            System.out.print(" " +y);
		            z--;
		        }
		    }
		
	    }
	}
}
