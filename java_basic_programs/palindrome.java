import java.util.Scanner;

class palindrome {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0,r;
        while(n>0){
        
        r = n%10;
        sum = (sum*10)+r;
        n = n/10;
        }    
        System.out.println(sum);
        if(n%sum == 0)
          System.out.println("paindrome");
        else
          System.out.println("Not a palindrome");
    }
}
