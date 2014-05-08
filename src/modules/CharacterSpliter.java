package modules;

public class CharacterSpliter {
	private String word=new String();
	public String words[]=new String[100];
	public int LenArr;
	CharacterSpliter(String w)
	{
		word=w;
	}
	public void charSeparator()
	{
		int i=0,len=word.length(),w=0;
		while(i<len)
		{
			if(!(word.charAt(i)>='a'&&word.charAt(i)<='z'||word.charAt(i)>='0'&&word.charAt(i)<='9'||word.charAt(i)>='A'&&word.charAt(i)<='Z'))
			{
				String temp=new String();
				temp+=word.charAt(i);
				words[w++]=temp;
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
				words[w++]=temp2;
			}
		}		
		LenArr=w;		
	}
}
