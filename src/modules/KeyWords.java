package modules;
//*********************************tested**************************************
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class KeyWords {
	public ArrayList<String> keyWords=new ArrayList<String>();
	
	public ArrayList<String> getKeyWords() {
		return keyWords;
	}

	void read(String aFileName)throws IOException
	{
		Path path = Paths.get(aFileName);
		try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String line = null;
			while((line=reader.readLine())!=null){
				String s[] = line.split(" ");
				for(int i=0;i<s.length;i++){
					String ts = new String();
					ts=s[i];
					CharacterSeparator characterSeperator = new CharacterSeparator(ts);
					characterSeperator.charSeparator();
					int j=0;
					while(j<characterSeperator.LenArr)
					{
						String temp=new String();
						temp=characterSeperator.words[j];
						keyWords.add(temp);
						j++;
						
						}
					};
				}
					
			}
		}
	}

