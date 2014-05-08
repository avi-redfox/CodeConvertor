package modules;

public class CharacterSeparator {
	private String word=new String();
	private char ch;
	public String words[]=new String[100];
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
			ch=word.charAt(i);
			if(!(ch>='a'&&ch<='z'||ch>='0'&&ch<='9'||ch>='A'&&ch<='Z'))
			{
				String temp=new String();
				temp+=ch;
				words[w++]=temp;
				i++;
				//System.out.println("words["+w+"]="+temp);				
			}
			/*
			else if(ch=='}')
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
					temp2+=ch;
					i++;
				}while(ch>='a'&&ch<='z'||ch>='0'&&ch<='9'||ch>='A'&&ch<='Z');
				System.out.println("\n"+temp2);
				words[w++]=temp2;
			}
		}		
		LenArr=w;		
	}

}
