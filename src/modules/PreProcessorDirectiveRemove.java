package modules;
//****************************************tested*******************************************************
import java.io.IOException;
import java.util.ArrayList;

public class PreProcessorDirectiveRemove {
	public ArrayList<String> removePreProcessorDirective(ArrayList<String> src)throws IOException
	{
		ArrayList<String> preProcessor = new ArrayList<String>();
		ArrayList<String> keys = new ArrayList<String>();
		
		boolean True=true;
		
		KeyWords k = new KeyWords();
		
		k.read("C:\\Users\\avishek\\Desktop\\KeyWords.txt");//read the key word files
		keys = k.getKeyWords();
		
		preProcessor = src;
		int i = 0;
		for(;i<preProcessor.size();)
		{
			if(i<preProcessor.size()&&preProcessor.get(i).equals("#"))
			{
				int j = i;
				String remove=new String();
				do
				{
					remove = preProcessor.get(j);
					preProcessor.remove(j);
					String key = new String();
					int m = 0;
					for(m=0;m<keys.size();m++)
					{
							key = keys.get(m);
							True = remove.equals(key)||remove.equals(">");
							if(True)break;
					}
					
				}
				while(!True&&i<preProcessor.size());
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
