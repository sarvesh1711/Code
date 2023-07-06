import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter no");
int no=sc.nextInt();
int num=no;
int temp=0;

for(int i=2;i<=no-1;i++)
{
		if(no%i==0)
		{
			temp=temp+1;
		}
}

if(temp==0)
{
	System.out.println("prime");
}
else
{
	System.out.println("not prime");
}
}
}



