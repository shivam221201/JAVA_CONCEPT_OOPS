import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while(sc.hasNext())
            System.out.println(++line_num + " " + sc.nextLine());

    }
}





/* The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Sample Input
Hello world
I am a file
Read me until end-of-file.

Sample Output
1 Hello world
2 I am a file
3 Read me until end-of-file.
*/