import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.println();
        
        int c = 2;
        while(c<n){
            if(n%c==0){
                System.out.println("it is not a prime number");
                break;
            }
            c++;
        }
        if(c==n){
            System.out.println("it is prime number");
        }
    }
}
