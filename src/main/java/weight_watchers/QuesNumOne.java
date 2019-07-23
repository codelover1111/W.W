package weight_watchers;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class QuesNumOne {

	public static void main(String[] args) throws IOException {
		File file = new File("dictionary.txt");
		FileOutputStream fos = new FileOutputStream(file); 
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Apple-a fruit, a tech farm"+"\n"
				+ "Table-an object, contains"
				+ " rows and columns when used in context of computers"+"\n"
				+ "Orange-a fruit");
		
		try{
			if(!file.exists()){
		}
			   file.createNewFile();
		}
		catch(IOException e)
	{
		e.printStackTrace();
	}

	FileInputStream fInputStream= new FileInputStream(file);
	DataInputStream dInputStream = new DataInputStream(fInputStream);
	String inputData = ((DataInputStream) dInputStream).readUTF();
	
	
	String[] wordList = inputData.split("[-,\n]");
	for(String printWord : wordList)
		System.out.println(printWord);

}}

