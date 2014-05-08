package modules;

import java.util.ArrayList;

public class ResolveMain {
	
	ArrayList<String> list = new ArrayList<String>();
	ResolveMain(){
		
		list.add("Class");list.add("Demo");list.add("{");list.add("public");list.add("static");list.add("void");list.add("main");list.add("(");list.add("String");list.add("args");list.add("[");list.add("]");list.add(")");
	}
	
	
	
	public  ArrayList<String> doResolveMain(ArrayList<String> srcList){
		int startpos;
	for(int i=0;i<srcList.size();i++){
		if(srcList.get(i).equals("main"))
		{
			startpos = i;
			if(startpos==0)
			{
				for(int j=0;j< list.size() ; j++)
				{
					srcList.add(j, list.get(j));
				}// need to delete everything between 
				
				
					
			
			}
			else if(srcList.get(i-1).equals("int") || srcList.get(i-1).equals("void"))
			{
				srcList.remove(i-1);
				for(int j=)
			}
		}
	}
	return srcList;
}
}
