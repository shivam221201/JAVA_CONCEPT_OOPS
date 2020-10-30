import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter n1:");
    int n1 = scan.nextInt();
    System.out.print("Enter n2:");
    int n2 = scan.nextInt();
    
    n1 = n1-n2;
    n2 = n1 + n2;
    n1 = n2 - n1;
    
          System.out.println("n1 = " + n1);
             System.out.print("n2 = " + n2);
    }
}
