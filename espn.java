//JGore
import java.util.Scanner;
import java.io.IOException;
	
public class espn
{
	public static void main(String[] args) throws IOException
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter a command");
		String command;
		
		gradebook g = null;
		while(true)
                {
                   command = cin.nextLine();
                   if(command.equalsIgnoreCase("Read"))
                   {
                	   System.out.println("Please enter the name of the gradebook file.");
                	   String filename = cin.nextLine();
                	   g=new gradebook(filename);
                   }
                    if(command.equalsIgnoreCase("Max"))
                    {
                        System.out.println(g.Max());
                        System.out.println("Enter another command.");
                    }
                    if(command.equalsIgnoreCase("Min"))
                    {
                        System.out.println(g.Min());
                        System.out.println("Enter another command.");
                    }
                    if(command.equalsIgnoreCase("Average"))
                    {
                        System.out.println(g.Mean());
                        System.out.println("Enter another command.");
                    }
                    if(command.equalsIgnoreCase("Median"))
                    {
                        System.out.println(g.Median());
                        System.out.println("Enter another command.");
                    }
                    if(command.equalsIgnoreCase("Distro"))
                    {
                        int [] distro = g.Distrobution();
                		System.out.println("You have "+ distro[4] +" F(s)");
                		System.out.println("You have "+ distro[3] +" D(s)");
                		System.out.println("You have "+ distro[2] +" C(s)");
                		System.out.println("You have "+ distro[1] +" B(s)");
                		System.out.println("You have "+ distro[0] +" A(s)");
                		System.out.println("Enter another command.");
                    }
                    if(command.equalsIgnoreCase("Count"))
                    {
                    	System.out.println("There are "+g.grades.length+" grades in this gradebook.");
                    }
                    if(command.equalsIgnoreCase("Empty"))
                    {
                    	g=null;
                    	System.out.println("Emptied gradebook.");
                    	System.out.println("Enter read command, then the filename to continue.");
                    }
                    if(command.equalsIgnoreCase("Exit"))
                    {
                    	System.out.println("Goodbye!");
                    	break;
                    }
                }
		cin.close();
	}
}