package modules;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
public void writeFile(ArrayList<String> list)throws IOException{
	FileWriter writer = new FileWriter("C:\\Users\\avishek\\Desktop\\JavaTest.java");
	for(String str:list)
	{
		writer.write(str);
	}
	
	writer.close();	
	
}
}
