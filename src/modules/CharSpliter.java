package modules;

public class CharSpliter {
	private String word=new String();
	public String words[]=new String[100];
	public int LenArr;
	CharSpliter(String w)
	{
		word=w;
	}
	public void charSeparator()
	{
		int i=0,len=word.length(),w=0;
		String temp2=new String();
		for(;i<len;i++)
		{
			if(word.charAt(i)=='{')
			{
				words[w++]="{";
				System.out.println("words["+w+"]={");
				
			}
			else if(word.charAt(i)=='}')
			{
				words[w++]="}";
				System.out.println("words["+w+"]=}");
				

			}
			else
			{
				temp2+=word.charAt(i);
				System.out.println("\n"+temp2);
			}
		}
		words[w++]=temp2;
		LenArr=w;		
	}
}
