//JGore
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class esp 
{
	
	static int gradesMin(int [] grades)
	{
		return grades[0];
	}
	static int gradesMax(int [] grades)
	{
		return grades[grades.length-1];
	}
	static double gradesMean(int [] grades)	
	{
		
	}
	static int gradesMedian(int [] grades)
	{
		
	}
	static int [] gradesDistribution(int [] grades)
	{
		int [] distro = {0,0,0,0,0};
		
		
	}
	static void printGradesInfo()
	{
		System.out.println(gradesMin());
		System.out.println(gradesMax());
	}	
	
	public static void main(String[] args) throws IOException
	{
		Scanner fin=new Scanner(new FileReader("grades.txt"));
			int n=fin.nextInt();
				int [] a=new int[n];
				
		for(int i=0;i<n;i++)
		{
			a[i]=fin.nextInt();
				Arrays.sort(a);
		}
		fin.close();
	}

}