package modules;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Starter {
	public ArrayList<String> srcList=new ArrayList<String>();
	public ArrayList<String> classNamesList=new ArrayList<String>();
	
	
	public ArrayList<String> getSrcList() {
		return srcList;
	}


	public void setSrcList(ArrayList<String> srcList) {
		this.srcList = srcList;
	}


	public ArrayList<String> getClassNamesList() {
		return classNamesList;
	}


	public void setClassNamesList(ArrayList<String> classNamesList) {
		this.classNamesList = classNamesList;
	}


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
					CharacterSeparator charSep = new CharacterSeparator(ts);
					//System.out.println("1--------"+ts);					
					charSep.charSeparator();
					//System.out.println("2--------"+ts);
					
					int j=0;
					while(j<charSep.LenArr)
					{
						String temp=new String();
						temp=charSep.words[j];
						//System.out.println(temp);
						srcList.add(temp);
						j++;
						}
					};
				}
					
			}
		/*ClassNames classNames = new ClassNames();
		classNames.createClassName(srcList);*/
		}
	}
