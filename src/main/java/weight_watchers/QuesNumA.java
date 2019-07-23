package weight_watchers;

import java.io.File;
import java.io.IOException;

public class QuesNumA {

	public static void main(String[] args) {
		File file;
	      try
	      {
	         file = File.createTempFile("/weight_watchers", ".txt");
	          
	         boolean exists = file.exists();
	          
	         System.out.println(" file exists : " + exists);
	      } catch (IOException e)
	      {
	         e.printStackTrace();
	      }
	}

}
