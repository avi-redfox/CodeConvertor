package modules;
/*
 * *********************************well testes   ***************************************
 * 1.issue
 * if any string contain semicolon(;) then this will not be handled
 * Example: cout<<"Hello;World"<<a; -------> System.out.print("Hello);"World<<a;
 * 
*/
import java.util.ArrayList;

public class CoutConvertMy {
	public ArrayList<String> doCoutConvert(ArrayList<String> srcList){
		 boolean True;
		 ShowIt s = new ShowIt();
		 int startpos = 0;
		 for(int i = 0; i < srcList.size()-3; )
		 {	
			 True = srcList.get(i).equals("cout") && srcList.get(i+1).equals("<") && srcList.get(i+2).equals("<"); 
			 if(True)
			 {
				 int countAng = 1;
				 int countCot = 0;
				 srcList.remove(i);
				 srcList.add(i,"System.out.print(");
				 i++;
				 srcList.remove(i);
				 srcList.remove(i);
				if(countAng != 1)
					 srcList.add(i,"+");
				 startpos = i; 
				 String colon =new String();
				 String cot = new String();
				do
				 {
					colon = srcList.get(i);
				
					String cote =new String();
					/*if(colon.equals("\""))
					{
						int k = i;						
						do 
						{
							cote += srcList.get(k);
							s.show(cote);
							k++;
						}
						while(k<srcList.size()-1&&srcList.get(k+1).equals("\""));
						
					}
					//s.show(cote);
					
					if(colon.equals("\""))
					{
						if(cot.isEmpty())
						{
							s.show("**************");
							s.show("prev: "+colon+countCot+cot);
							countCot--;
							cot = "\"";
							s.show("now: "+colon+countCot+cot);
							s.show("**************");
						}
						else if(cot.equals("\""))
						{
							s.show("**************");
							s.show("prev: "+colon+countCot+cot);
							countCot++;
							cot = "";
							s.show("now: "+countCot+colon+cot);
							s.show("**************");
						}
					}
					*/
					if(colon.equals("<") && srcList.get(i+1).equalsIgnoreCase("<") && countAng >0 )
					 {
						 countAng ++;
						 srcList.remove(i);
						 srcList.remove(i);
						 srcList.add(i,"+");
						 i++;					 
					 }
					 else
						 i++;	
					//s.show(srcList.get(i));
					
				 }while(!srcList.get(i).equals(";")&&i<srcList.size());					
			 //}while(!colon.equals(";")&&i<srcList.size()&&countCot==0);
			 srcList.add(i, ")");				
			 }
			 else 
				 i++;			 
		 }
		s.show("----------------------------------------------------------------------");
		return srcList;
	}
	
}
