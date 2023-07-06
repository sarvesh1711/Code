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

Output:

D:\Aurionpro>javac Fibonacci.java

D:\Aurionpro>java Fibonacci
10
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
D:\Aurionpro>javac Fibonacci.java
