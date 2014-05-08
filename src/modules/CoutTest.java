package modules;

import java.util.ArrayList;


public class CoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> srcList = new ArrayList<String>();
		srcList.add("cout");
		srcList.add("<");
		srcList.add("<");
		srcList.add("hello");
		srcList.add("world");
		srcList.add("<");
		srcList.add("<");
		srcList.add("i");
		srcList.add(";");
		
		CoutConvert cout = new CoutConvert();
		srcList = cout.doCoutConvert(srcList);
		for(int i = 0 ;i < srcList.size(); i++)
		{
			System.out.print(srcList.get(i));
		}
	}

}
