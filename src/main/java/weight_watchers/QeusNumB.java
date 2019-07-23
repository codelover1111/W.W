package weight_watchers;
import java.io.*;
import java.io.IOException;
import java.util.*;
public class QeusNumB {

	public static void main(String args[])
	  {
	  try{
	 

	  FileInputStream fstream = new FileInputStream("read.txt");
	  
	  DataInputStream in = new DataInputStream(fstream);
	  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	  String strLine;
	  //Read File Line By Line
	  while ((strLine = br.readLine()) != null)   {
	  // Print the content on the console
	  System.out.println (strLine);
	  }
	  //Close the input stream
	  in.close();
	    }catch (Exception e){//Catch exception if any
	  System.err.println("Error: " + e.getMessage());
	  }
	  }
}
