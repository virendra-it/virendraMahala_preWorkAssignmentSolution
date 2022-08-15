import java.util.Scanner;

public class Assignment 
{
	public static void palindromeCheck()
	{

		   int num,temp,rev=0;
			System.out.println("Enter number to check palindrome");
			Scanner in= new Scanner(System.in);
			num=in.nextInt();
			System.out.println("Number is:"+num);
			int orgnum=num;
			while(num>0) 
			{
			temp=num%10;
			num=num/10;
			rev=rev*10+temp;
			}
			System.out.println("reversed number is:"+rev);
			
			if(orgnum==rev){
			
				System.out.println("Number is palindrome");
			}
			else {
				System.out.println("number is not palindrome");
			}
		 
		
	   
	}
	
	public static void starPattern()
	{
		System.out.println("Enter the number for printing Star pattern in decreasing order");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			for(int j=i;j<=n;j++)
			{
			System.out.print("*");
		    }
			System.out.println();
	    }
	}
	
	public static void checkPrime()
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter number to check prime");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			 {
				count++;
			 }
			
		}
		if (count==2)
			System.out.println("Number is prime");
		else {
			System.out.println("Number is not prime");
		}
	}
	
	
	public static void fibonacciSeries()
	{
		System.out.println("Enter the number to print fibonacci series");
		int a=0,b=1,c,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(a);
			if(i<n)
				System.out.print(",");
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}
	
	
	
	
	
			public static void main(String[] args) 
			{
				int option;
				Scanner input= new Scanner(System.in);
 do {
	        System.out.println("Enter your choice from below options:");
			System.out.println("1. Check for palindrome number");
			System.out.println("2. Prints the pattern of stars in decreasing order based on the input");
			System.out.println("3. Check whether the input number is a prime number");
			System.out.println("4. Print Fibonacci series of size n with first two numbers as 0, 1");
			System.out.println("Select an option (1/2/3/4): "+"and 0 to exit.\n");
			
			 option=input.nextInt();
			  switch(option)
			  {
			   case 0:
				   break;
			   case 1:
			   {
				   palindromeCheck();
				 
				 break;
			   }
			   case 2:
			   {
				   starPattern();
				   break;
			   }
			   
			   case 3:
			   {
				   checkPrime();
				   break;
			   }
			   
			   case 4:
			   {
				   fibonacciSeries();
				   break;
			   }
			   default :
			   {
				   System.out.println("Enter the option from 1 to 4 only");
			   }
			   
			   
			  }
			
 } while(option!=0);
 {
	System.out.println("Program exited successfully"); 
	input.close();
	
 }
			
			}
}