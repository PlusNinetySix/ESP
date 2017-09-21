//JGore
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
	
public class espn
{
	public static void main(String[] args) throws IOException
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter a command");
		String command;
		
		gradebook g = null;
                {
                   command = cin.nextLine(); 
                    if(command.equalsIgnoreCase("Max"));
                    {
                        System.out.println(g.Max());
                    }
                    if(command.equalsIgnoreCase("Min"));
                    {
                        System.out.println(g.Min());
                    }
                    if(command.equalsIgnoreCase("Average"));
                    {
                        System.out.println(g.Mean());
                    }
                    if(command.equalsIgnoreCase("Median"));
                    {
                        System.out.println(g.Median());
                    }
                    if(command.equalsIgnoreCase("Distrobution"));
                    {
                        System.out.println(g.Distrobution());
                    }
                }
		
		
	}
}
