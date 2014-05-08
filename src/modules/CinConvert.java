package modules;

import java.util.ArrayList;

public class CinConvert {
private  ArrayList<String> in_t = new ArrayList<String>();
private  ArrayList<String> floa_t= new ArrayList<String>();
private  ArrayList<String> doubl_e= new ArrayList<String>();
private  ArrayList<String> strin_g= new ArrayList<String>();

private ArrayList<String> datatypes= new ArrayList<String>();
private ArrayList<String> variables= new ArrayList<String>();
CinConvert(){
	in_t.add("=");in_t.add("sc");in_t.add(".");in_t.add("nextInt");in_t.add("(");in_t.add(")");in_t.add(";");
	floa_t.add("=");floa_t.add("sc");floa_t.add(".");floa_t.add("nextFloat");floa_t.add("(");floa_t.add(")");floa_t.add(";");
	doubl_e.add("=");doubl_e.add("sc");doubl_e.add(".");doubl_e.add("nextDouble");doubl_e.add("(");doubl_e.add(")");doubl_e.add(";");
	strin_g.add("=");strin_g.add("sc");strin_g.add(".");strin_g.add("nextInt");strin_g.add("(");strin_g.add(")");strin_g.add(";");
	
}
public ArrayList<String> doCinConvert(ArrayList<String> classList)
{
	
	for(int i = 0; i< classList.size()-1;i++)
	{
		if(classList.get(i).equals("int") || classList.get(i).equals("float") || classList.get(i).equals("Double") || classList.get(i).equals("String"))
		{
			datatypes.add(classList.get(i));
			variables.add(classList.get(i+1));
		}
	}// got all the variables with their datatypes
	int count = 0;
	for(int i=0; i<classList.size()-2;i++)
	{
		while(!classList.get(i).equals(";"))
		{
			if(classList.get(i).equals("cin") && classList.get(i+1).equals(">") && classList.get(i+2).equals(">") && count == 0 )
			{
				count ++;
				//put variables
			}
			else if(classList.get(i).equals("cin") && classList.get(i+1).equals(">") && classList.get(i+2).equals(">") && count > 1){
				count ++ ;
				// put variables 
			}
			
		}
	}
	return classList;
}
}
