import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int year;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the year");
	year=s.nextInt();
	
	boolean leap=false;
	if(year % 4 == 0)
	{
		if(year % 100 == 0)
		{
			if(year % 400 == 0)
			leap=true;
			else 
			leap=false;
		}
		else
		leap=true;
	}
	else
	leap=false;

	if(leap==true)
	System.out.println(year +"is a leap year.");
	else
	System.out.println(year +"is not a leap year.");
		}
// your code goes here
	}
