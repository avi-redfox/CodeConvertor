package modules;

import java.util.ArrayList;

public class CoutConvert {
	ArrayList<String> sop; 
	
	public ArrayList<String> doCoutConvert(ArrayList<String> srcList){
		 sop = new ArrayList<String>();
		 sop.add("System");
		 sop.add(".");
		 sop.add("out");
		 sop.add(".");
		 sop.add("println");
		 sop.add("(");
	
	
		 int startpos;
		 for(int i = 0; i < srcList.size()-3; ){
			 
			 if(srcList.get(i).equals("cout") && srcList.get(i+1).equals("<") && srcList.get(i+2).equals("<"))
			 {
				  startpos = i; int count =1; i=i+3;
				 while(!srcList.get(i).equals(";"))
				 {
					 if(srcList.get(i).equals("<") && srcList.get(i+1).equalsIgnoreCase("<") && count >1 )
					 {
						 count ++;
						 sop.add("+");
						 i++;
					 }
					 else
					 {
						 sop.add(srcList.get(i));
						 i++;
					 }
				 }sop.add(")");sop.add(";");
			 }else break;
			 for(int j = startpos,  k = 0;k < sop.size();j++,k++)
			 {
				 srcList.add(j, sop.get(k));
			 }
			 for(int j = startpos + sop.size(); ! srcList.get(j).equals(";");j++){
				 srcList.remove(j);
			 }
		 }
		
		
		
		
		
		return srcList;
	}
	
}
