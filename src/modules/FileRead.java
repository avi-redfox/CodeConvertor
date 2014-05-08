package modules;
import java.io.*;
class FileRead
{
	String srcFileName,trgFileName;
	/*public FileRead(String fl)
	{
		srcFileName=new String(fl);
		trgFileName=new String(fl.substring(0,fl.length()-4)+".java");
		
	}
	public void readFile(Object CharSpliter)
	{
		resolvemain();
		resolveoutline();
		BufferedReader reader = new BufferedReader(srcFileName);
		String line = null;
		PrintWriter writer = new PrintWriter(trgFileName);
		while ((line = reader.readLine()) != null) {
		String s1[]=Convertor.convert(line.split(" "));
		/*********/
		//for(int i=0;i<s1.length;i++)
		//	CharacterSeparator v =new CharacterSeparator(s1[i]);
		/*******/
			for(int i=0;i<s1.length;i++)
				writer.println(s1[i]+" ");
			
		}
		writer.close();
		reader.close();
	}
	void resolvemain()
	{
		BufferedReader reader = new BufferedReader(srcFileName);
		String line = null;int x=0,y=0;
		PrintWriter writer = new PrintWriter(trgFileName);
		while ((line = reader.readLine()) != null) {
		    String s1[]=line.split(" ");
			wd=s1[0]+" "+s1[1];
			for(int i=1;i<s1.length-1;i++)
			{
				if(s1[i].equals("main()") || s1[i].equals("void main()")||s1[i].equals("int main()"))
				{
					s1[i]="class Abc{ public static void main(String args[])");
					x=1;
				}
				if(x!=1&&y==0)
				{
					writer.println(s[0]+" ");
					y=1;
				}
				writer.println(s1[i]+" ");
				wd=s[i]+" "+s[i+1];
			}
			
		}
		writer.close();
		reader.close();
	}
	void resolveoutline()
	{
	int count=0;
		String code[];
		//int length=source.length();
		do
		{
			if(source.charAt(i)=='{')
			{
				count++;
				String temp=new String(source.charAt(i));
				code[i]+=temp;
			}
			else if(source.charAt(i)=='}')
			{
				count--;
				String temp=new String(source.charAt(i));
				code[i]+=temp;				
			}
			else
			{
				
}
