import java.util.Scanner;

class perfect_no {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n%i == 0){
             sum = sum + i;
            }
        }
        
        if(n%sum == 0)
         System.out.println("perfect no.");
        else
         System.out.println("not a perfect no.");
         
    }
}
