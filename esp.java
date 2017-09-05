//JGore
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.io.BufferedReader;

public class esp 
{
	
	static int gradesMin(int [] grades)
	{

	}
	static int gradesMax(int [] grades)
	{

	}
	static double gradesMean(int [] grades)	
	{

	}
	static int gradesMedian(int [] grades)
	{
		
	}
	static int [] gradesDistribution(int [] grades)
	{
		int [] distro= {0,0,0,0,0};
		
	}
	//extra credit---remove this function if you don't do the EC
	static double gradesStandardDev(int [] grades)
	{
		
	}
	/* you will need to fill in the arguments for this function.
	 * the arguments should be the various statistics you computed
	 * and should print them out in a neatly-formatted manner.
	 */
	static void printGradesInfo()
	{
		
	}	
	
	public static void main(String[] args) throws IOException
	{
		Scanner fin=new Scanner(new FileReader("grades.txt"));
			int n=fin.nextInt();
				int [] a=new int[n];
				
		for(int i=0;i<n;i++)
		{
			a[i]=fin.nextInt();
		}
			//System.out.println(n);
		fin.close();
	}

}