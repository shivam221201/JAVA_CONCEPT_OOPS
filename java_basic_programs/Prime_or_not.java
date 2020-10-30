import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    int flag =0;
    int n = scan.nextInt();
    for(int i=2; i< n/2; i++){
        
        if(n%i == 0)
        {
            System.out.println("Not a prime no");
            flag = 1;
            break;
        }
    }
    if(flag == 0)
    System.out.print("Prime no.");
       
    }
}
