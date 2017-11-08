package tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExistsInJava  {

	public boolean doesFileExist(String path){

		try
		{
			// reading the contents from the OS file 
			FileReader file= new FileReader(path);
			//temporarily storing file content from filereader object
			BufferedReader reader= new BufferedReader(file);	
		}
		catch(FileNotFoundException e) 
		{
			return false;
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {

		FileExistsInJava fE= new FileExistsInJava();
		String path=System.getProperty("user.dir")+"//MYFILE1.txt"; 
		System.out.println("File Exists : "+fE.doesFileExist(path));

		if (fE.doesFileExist(path)== true);
		{
			// reading the contents from the OS file 
			FileReader file = new FileReader(path);

			// temporarily store the file content from FileReader
			BufferedReader br = new BufferedReader(file);

			int count = 1;
			String line = br.readLine();//keeps reading line after line until line is null

			System.out.println("Reading file line by line : ");
			while(line != null){
				System.out.println(count + " : " + line);
				line = br.readLine(); count++;
			}
			br.close();
		}

	}


}
