import java.util.Scanner;
public class Main {
	Scanner sc= new Scanner(System.in);
	public void checkPalindrome(){
		int num, reverse=0, remainder;
		num= sc.nextInt();
		while(num!=0) {
			remainder=num % 10;
			reverse= (reverse*10) + remainder;
			num= num/10;
		}
		if(num==reverse){
			System.out.println("Number is a palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
	}
	public void printPattern(){
		int rows;
		rows=sc.nextInt();
		for(int i=rows-1; i>=0; i--)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.println("*" + "");
			}
		}
		
	}
	public void checkPrimeNumber(){
		int num, x=0, flag=0;
		num= sc.nextInt();
		x= num/2;
		if(num==0||num==1) {
			System.out.println("The number is not prime.");
		}
		else {
			for(int i=2; i<=x;) {
				if(num%i==0)
					System.out.println("The number is not a prime number.");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The number is a prime number.");
		}
		}
	public void printFibonacciSeries(){
		int first=0, second=1, num;
		num= sc.nextInt();
		for(int i=1; i<=num; ++i) {
			System.out.println(first  +", ");
			int next= first + second;
			first =second;
			second = next;
		}
	}
		public static void main(String args[]) {
			Main obj= new Main();
			int choice;
			Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Enter your choice from below list.\n"+"1.Find palindrome of number.\n"+"2.Print pattern for a given number.\n"+"3.Check whether the number is a prime number.\n"+"4.Print Fibonacci series.\n"+"-->Enter 0 to Exit.\n");
			System.out.println();
			choice=sc.nextInt();
			switch(choice) {
			case 0:
				choice= 0;
				break;
			case 1:{
				obj.checkPalindrome();
				System.out.println("Enter a number to check if it is palindrome:");
			}
			break;
			case 2:{
				obj.printPattern();
				System.out.println("Enter a number to print pattern:");
			}
			break;
			case 3:{
				obj.checkPrimeNumber();
				System.out.println("Enter a number to check whether it is prime number:");
			}
			break;
			case 4:{
				obj.printFibonacciSeries();
				System.out.println("Enter a number to print Fibonacci series:");
			}
			break;
			default:
				System.out.println("Invalid choice.Enter a valid no.\n");
			}
		}while(choice!=0);
		System.out.println("Exited Successfully!!!");
		sc.close();
	}

}
