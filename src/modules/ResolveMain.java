package modules;

import java.util.ArrayList;
// working fine.  // remove return 0;
public class ResolveMain {
	
	ArrayList<String> list = new ArrayList<String>();
	ResolveMain(){
		
		list.add("Class");list.add("Demo");list.add("{");list.add("public");list.add("static");list.add("void");list.add("main");list.add("(");list.add("String");list.add("args");list.add("[");list.add("]");list.add(")");
	}
	
	
	
	public  ArrayList<String> doResolveMain(ArrayList<String> srcList){
		int startpos;
		System.out.println("entered resolve main");
	for(int i=0;i<srcList.size();i++){
		if(srcList.get(i).equals("main"))
		{	
			
			startpos = i;
			if(startpos==0)
			{
				System.out.println("Found main at 0");
				do
				{	
					System.out.println("Deleting..");
					srcList.remove(i);
					i++;
				}while(!srcList.get(i).equals("{"));
				
				for(int k=list.size()-1;k>=0;k--)
					srcList.add(i, list.get(k));
				
				break;	
			
			}
			else if(srcList.get(i-1).equals("int") || srcList.get(i-1).equals("void"))
			{
				System.out.println("found main at other position");
				i--;
				do
				{		
					System.out.println("Deleting main");
					srcList.remove(i);
					i++;
				}while(!srcList.get(i).equals("{"));
				for(int k=list.size()-1;k>=0;k--)
					srcList.add(i, list.get(k));
					
				break;
			
			}
		}
		
	}
	for(int i=0; i <srcList.size()-3;i++)
	{
		if(srcList.get(i).equals("return") && srcList.get(i+1).equals("0"))
		{
			srcList.remove(i);srcList.remove(i);srcList.remove(i);
		}
	}
	return srcList;
}
}
