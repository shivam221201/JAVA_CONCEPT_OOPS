import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringToCharArray {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();

        for(int i=0; i<N; i++){
            String str = scan.nextLine();
            char[] charArray = str.toCharArray();

            for(int j=0; j < charArray.length; j++){
                if(j % 2 == 0){
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");
            
            for(int j=0; j < charArray.length; j++){
                if(j % 2 != 0){
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }
        scan.close();
    }
}