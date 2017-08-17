import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils
{
	static void ReadConnectionsFile(String fileName)
	{
		BufferedReader br;
		try
		{
		    br = new BufferedReader(new FileReader(fileName));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not found");
			return;
		}
		
		try 
		{
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		} 
		catch(IOException ex)
		{
			System.out.println("IO exception");
		}
		
		finally 
		{
		    try{br.close();}catch(IOException ex){System.out.println("IO exception");}
		}
	}
}
