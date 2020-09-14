/* Ex-
Input: 11 6
Output: 12

Input: 19 11
Output: 22 */

import java.util.Scanner;
public class NearestMultiple{
	public static void main(String[] args) {
	    int temp;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number:");
        int num = scan.nextInt();

        System.out.println("Enter Divisor:");
        int div = scan.nextInt();

        temp = num%div;
        
        if(temp>=(div/2))
            num+= div-temp;
        else
            num = num - temp;
            System.out.println(num);
    
    }
}
