//JGore
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
	
public class gradebook
{
	int [] grades;
	
	int Min() 
	{
		return grades[0];
	}
	
	int Max()
	{
		return grades[grades.length-1];
	}
	
	double Mean()
	{
		{
		double sum = 0;
			for(int i = 0; i<grades.length; i++)
			{
				sum = (sum + grades[i]);
			}		
			sum = sum/grades.length;
				return sum;
		}
	}
	
	double Median()
	{
		double median;
		if (grades.length % 2 == 0)
			median = ((double)grades[grades.length/2]+(double)grades[grades.length/2 - 1])/2;
		else
			median = (double) grades[grades.length/2];
				return median;
	}
	
	int[] Distrobution()
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
	
	public gradebook(String filename) throws IOException
	{
		Scanner fin=new Scanner(new FileReader(filename));
			int n=fin.nextInt();
				grades=new int[n];
				
		for(int i=0;i<n;i++)
		{
			grades[i]=fin.nextInt();
		}
		Arrays.sort(grades);
			fin.close();
	}
}
