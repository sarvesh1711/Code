import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int no=sc.nextInt();
	int fact=1;
	
	for(int i=1;i<=no;i++){
		if(no>=1)
		{
		fact=fact*i;
	}
	}
	System.out.println(fact);
}
	
}
	

output:

D:\Aurionpro>javac Factorial.java
	
D:\Aurionpro>java Factorial
Enter no
5
120

D:\Aurionpro>javac Factorial.java

D:\Aurionpro>java Factorial
Enter no
9
362880
	

	
	
	


