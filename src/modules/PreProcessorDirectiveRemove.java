package modules;

import java.util.ArrayList;

public class PreProcessorDirectiveRemove {
	public ArrayList<String> removePreProcessorDirective(ArrayList<String> src)
	{
		ArrayList<String> preProcessor = new ArrayList<String>();
		preProcessor = src;
		int i = 0;
		for(int x=0;x<preProcessor.size();x++)
		{
			//System.out.println(x+" "+preProcessor.get(x));
		}
		//System.out.println("-----------------------------------------------------------");
		for(;i<preProcessor.size();)
		{
			//System.out.println("0"+i+" "+preProcessor.get(i));
			if(preProcessor.get(i).equals("#"))
			{
				int j = i;
				String remove=new String();
				do
				{
					//System.out.println("*****"+j+" "+preProcessor.get(j));
					remove = preProcessor.get(j);
					preProcessor.remove(j);
					
				}
				while(!(remove.equals(">") || remove.equals("main") || remove.equals("class") || remove.equals("int") || remove.equals("void") || remove.equals("struct") || remove.equals("union") || remove.equals("enum") ));
				if(!remove.equals(">"))
				{
					preProcessor.add(j,remove);
				}
			}
			else
				i++;
		}
		return preProcessor;
	}

}
