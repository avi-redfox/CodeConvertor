package modules;
/*******************tested*************************/
import java.util.ArrayList;

public class ClassNames {
	private ArrayList<String> className = new ArrayList<String>();	
	
public ArrayList<String> getClassName() {
		return className;
	}

	public void setClassName(ArrayList<String> className) {
		this.className = className;
	}

public ArrayList<String> createClassName(ArrayList<String> srcList){
	for(int i =0; i<srcList.size();i++)
		if(srcList.get(i).equals("class"))
			className.add(srcList.get(i+1));	
	return className;
}

}
