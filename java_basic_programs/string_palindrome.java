
import java.util.*;

public class string_palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        StringBuilder s2 = new StringBuilder();
        s2.append(s1);
        s2 = s2.reverse();
         String s3 = s2.toString();
        if(s1.equals(s3
        
        ))
            System.out.print("Pallindrome");
        else
            System.out.print("Not a Pallindrome");


    }
}