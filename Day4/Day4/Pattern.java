// Java code to demonstrate star pattern
import java.io.*;

public class Pattern
{
	
// function to print a row
static void printn(int num)
{
	// base case
	if (num == 0)
		return;
	System.out.print ("* ");
	printn(num - 1);
}
static void pattern(int n, int i)
{
	// base case
	if (n == 0)
		return;
	printn(i);
	System.out.println();
	pattern(n - 1, i + 1);
}
public static void main (String[] args)
{

	int n = 5;
	pattern(n, 1);
}
}

