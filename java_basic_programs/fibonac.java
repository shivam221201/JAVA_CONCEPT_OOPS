import java.util.Scanner;

class fibonac{

    public static void main(String[] args) {
        
    int n1=0, n2=1, n3;
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    while( count > 2 )
        {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            count--;
            
            System.out.print(" " +n3);
        }
       
    }
}
