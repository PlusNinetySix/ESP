//JGore
import java.util.Scanner;
import java.io.IOException;
	
public class espn
{
	public static void main(String[] args) throws IOException
	{
		/**
		 * 
		 * @param Scanner Allows for a command to be entered. 
		 * @param while Allows the user to enter multiple commands until it is terminated. 
		 */
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter a command");
		String command;
		
		gradebook g = null;
		while(true)
                {
					
                   command = cin.nextLine(); //User can read in commands.
                 
                   if(command.equalsIgnoreCase("Read"))
                   {//Reads the grades into an array.
                	   /**
                        * Allows the user to type the read command and enter the name of the gradebook file.
                        */
                	   System.out.println("Please enter the name of the gradebook file.");
                	   String filename = cin.nextLine();
                	   g=new gradebook(filename);
                   }
                   
                    if(command.equalsIgnoreCase("Max"))
                    {//Outputs the highest grade.
                    	/**
                         * Allows the user to view the highest grade.
                         */
                        System.out.println(g.Max());
                        System.out.println("Enter another command.");
                    }
                    
                    if(command.equalsIgnoreCase("Min"))
                    {//Outputs the lowest grade.
                    	/**
                         * Allows the user to view the lowest grade.
                         */
                        System.out.println(g.Min());
                        System.out.println("Enter another command.");
                    }
                    
                    if(command.equalsIgnoreCase("Average"))
                    {//Outputs the average grade.
                        System.out.println(g.Mean());
                        System.out.println("Enter another command.");
                        /**
                         * Allows the user to view the average grade.
                         */
                    }
                    
                    if(command.equalsIgnoreCase("Median"))
                    {//Outputs the middle-most grade.
                        System.out.println(g.Median());
                        System.out.println("Enter another command.");
                        /**
                         * Allows the user to view the middle-most grade.
                         */
                    }
                    
                    if(command.equalsIgnoreCase("Distro"))
                    {//Outputs the grade distrobution.
                        int [] distro = g.Distrobution();
                		System.out.println("You have "+ distro[4] +" F(s)");
                		System.out.println("You have "+ distro[3] +" D(s)");
                		System.out.println("You have "+ distro[2] +" C(s)");
                		System.out.println("You have "+ distro[1] +" B(s)");
                		System.out.println("You have "+ distro[0] +" A(s)");
                		System.out.println("Enter another command.");
                		/**
                         * Allows the user to view the grade distrobution.
                         */
                    }
                    
                    if(command.equalsIgnoreCase("Count"))
                    {//Outputs the number of grades.
                    	System.out.println("There are "+g.grades.length+" grades in this gradebook.");
                    	/**
                         * Allows the user to view how many grades are in the gradebook.
                         */
                    }
                    
                    if(command.equalsIgnoreCase("Empty"))
                    {//Clears the array.
                    	g=null;
                    	System.out.println("Emptied gradebook.");
                    	System.out.println("Enter read command, then the filename to continue.");
                    	/**
                         * Allows the user to empty the gradebook and put in the name of a new gradebook.
                         */
                    }
                    
                    if(command.equalsIgnoreCase("Exit"))
                    {//Quits the program.
                    	System.out.println("Goodbye!");
                    	break;
                    	/**
                         * Allows the user to exit the program.
                         */
                    }
                }
		cin.close(); //Closes cin.
	}
}