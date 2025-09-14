import java.util.Scanner;
class RecurssiveMethod
{
	public int FibonacciNumber(int n)
	{
		RecurssiveMethod obj = new RecurssiveMethod();
		if(n == 0 || n == 1)
			return n;
		else
		{	
			return obj.FibonacciNumber(n) + obj.FibonacciNumber(n-1);
		}
	}
}

public class Fibonacci
{
	public static void main(String args[])
	{
		RecurssiveMethod obj = new RecurssiveMethod();
		int i = obj.FibonacciNumber(10);
		System.out.println(i);
	}
}