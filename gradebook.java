//JGore
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
	
public class gradebook
{
	int [] grades;
	/**
	 * Lowest grade.
	 * @return Returns the lowest grade in the gradebook.
	 */
	int Min() 
	{//Outputs the lowest grade.
		return grades[0];
	}
	/**
	 * Highest grade.
	 * @return Returns the highest grade in the gradebook.
	 */
	int Max()
	{//Outputs the highest grade.
		return grades[grades.length-1];
	}
	/**
	 * Average grade.
	 * @return Returns the average grade for the gradebook.
	 */
	double Mean()
	{//Calulates average of the grades.
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
	/**
	 * Middle-most grade.
	 * @return Returns the middle-most grade.
	 * @param if Incase there is an even number of grades.
	 * @param else Incase there is an odd number of grades.
	 */
	double Median()
	{//First is if even grades, second is if odd.
		double median;
		if (grades.length % 2 == 0)
			median = ((double)grades[grades.length/2]+(double)grades[grades.length/2 - 1])/2;
		else
			median = (double) grades[grades.length/2];
				return median;
	}
	/**
	 * Grade distrobution.
	 * @return How many of each letter grade there is.
	 */
	int[] Distrobution()
	{//Puts grades into different categories.
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
	/**
	 * Main function.
	 * @param filename Asks for the filename.
	 * @throws IOException throws an IOException if file is not found.
	 */
	public gradebook(String filename) throws IOException
	{//Main function. Reads grades into an array.
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
