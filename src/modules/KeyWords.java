package modules;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class KeyWords {
	private ArrayList(String) keyWords = new ArrayList<String>();
	
	void read(String aFileName)throws IOException
	{
		Path path = Paths.get(aFileName);
		int srclistIndex=0;
		try(BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String line = null;
			//System.out.println("After SpaceWise Split");
			while((line=reader.readLine())!=null){
				//System.out.println(line);
				String s[] = line.split(" ");
				/*
				 for(int i=0;i<s.length;i++)
				{
					System.out.println("s["+i+"]="+s[i]);
				}
				*/
				
				for(int i=0;i<s.length;i++){
					String ts = new String();
					ts=s[i];
					//System.out.println("********s["+i+"]="+s[i]);
					//System.out.println("--------"+ts);
					CharacterSeparator characterSeperator = new CharacterSeparator(ts);
					//System.out.println("1--------"+ts);					
					characterSeperator.charSeparator();
					//System.out.println("2--------"+ts);
					
					int j=0;
					while(j<characterSeperator.LenArr)
					{
						String temp=new String();
						temp=characterSeperator.words[j];
						//System.out.println(temp);
						srcList.add(temp);
						j++;
						/*if(characterSeperator.words[j].equals("class")){
							String className = new String();
							className = characterSeperator.words[j+1];
							classNamesList.add(className);*/
						}
					};
				}
					
			}
		/*ClassNames classNames = new ClassNames();
		classNames.createClassName(srcList);*/
		}
	}
}
