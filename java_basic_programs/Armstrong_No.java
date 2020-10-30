import java.util.Scanner;

class Armstrong_No {

    public static void main(String[] args) {
        
    int sum = 0, c;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    while( n > 0 )
        {
        c = n%10;
        sum = sum + (c*c*c);
        n= n/10;
        }
        if(sum == n) {
            System.out.println("Armstrong no.");
        }
        else{
            System.out.println("Not a armstrong no.");
        }
       
    }
}
