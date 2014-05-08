package modules;

import java.util.ArrayList;

public class CharacterSeparator {
	private String word=new String();
	//private char word.charAt(i);
	public ArrayList<String> words=new ArrayList<String>();
	public int LenArr;
	CharacterSeparator(String w)
	{
		word=w;
	}
	public void charSeparator()
	{
		int i=0,len=word.length(),w=0;
		while(i<len)
		{
			//word.charAt(i)=word.charAt(i);
			if(!(word.charAt(i)>='a'&&word.charAt(i)<='z'||word.charAt(i)>='0'&&word.charAt(i)<='9'||word.charAt(i)>='A'&&word.charAt(i)<='Z'))
			{
				String temp=new String();
				temp+=word.charAt(i);
				words.add(temp);
				i++;
				//System.out.println("words["+w+"]="+temp);				
			}
			/*
			else if(word.charAt(i)=='}')
			{
				words[w++]="}";
				System.out.println("words["+w+"]=}");
				

			}
			*/
			else
			{
				String temp2=new String();
				do
				{
					temp2+=word.charAt(i);
					i++;
				}while(word.charAt(i)>='a'&&word.charAt(i)<='z'||word.charAt(i)>='0'&&word.charAt(i)<='9'||word.charAt(i)>='A'&&word.charAt(i)<='Z');
				System.out.println("\n"+temp2);
				words.add(temp2);
			}
		}		
		LenArr=w;		
	}

}
