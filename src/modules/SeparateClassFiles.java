package modules;

import java.util.ArrayList;

public class SeparateClassFiles {
	ArrayList<String> classList = new ArrayList<String>();
public void createSeparate(ArrayList<String> srcList){
	for(int i=0;i<srcList.size();)
	{
		if(srcList.get(i).equals("class"))
		{
			do
			{
				String className = srcList.get(i+1);
				ArrayList<String> classList = new ArrayList<String>();
				classList.add(srcList.get(i));
				i++;
			}while(!(srcList.get(i).equals("}")&&srcList.get(i+1).equals(";")));i++;
			ShowIt show = new ShowIt();
			show.show(classList);
		}
	}
	
}
}
