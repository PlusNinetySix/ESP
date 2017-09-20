//JGore
import java.util.Arrays;
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
		double sum = 0;
			for(int i = 0; i<grades.length; i++)
			{
				sum = (sum + grades[i]);
			}		
		sum = sum/grades.length;
			return sum;
	}
	static double gradesMedian(int [] grades)
	{
		double median;
		if (grades.length % 2 == 0)
			median = ((double)grades[grades.length/2]+(double)grades[grades.length/2 - 1])/2;
		else
			median = (double) grades[grades.length/2];
				return median;
	}
	static int [] gradesDistribution(int [] grades)
	{
		int [] distro = {0,0,0,0,0};
		for(int i = 0; i<grades.length; i++) 
		{
			if(grades[i]<60) {distro[4]++;}
			if(grades[i]<70 && grades[i]>=60) {distro[3]++;}
			if(grades[i]<80 && grades[i]>=70) {distro[2]++;}
			if(grades[i]<90 && grades[i]>=80) {distro[1]++;}
			if(grades[i]<100 && grades[i]>=90) {distro[0]++;}
		}
		return distro;
	}
	static void printGradesInfo(int [] grades)
	{
		int [] distro = gradesDistribution(grades); 
		System.out.println("The lowest grade is " + gradesMin(grades));
		System.out.println("The highest grade is " + gradesMax(grades));
		System.out.println("The average grade is " + gradesMean(grades));
		System.out.println("The middle grade is " + gradesMedian(grades));
		System.out.println("You have "+ distro[4] +" F's");
		System.out.println("You have "+ distro[3] +" D's");
		System.out.println("You have "+ distro[2] +" C's");
		System.out.println("You have "+ distro[1] +" B's");
		System.out.println("You have "+ distro[0] +" A's");
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
			printGradesInfo(a);
	}

}