import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter No: ");
	int no=sc.nextInt();
        
        int first = 0;
        int second = 1;
        
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= no; i++) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
