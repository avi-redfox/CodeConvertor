package modules;

import java.util.ArrayList;

public class SpaceSeparator {
	public ArrayList<String> doSpaceSeparate(ArrayList<String> srcList)
	{
		for(int i=1;i<srcList.size();i=i+2)
		{
			srcList.add(i," ");
		}
		return srcList;
	}
}
