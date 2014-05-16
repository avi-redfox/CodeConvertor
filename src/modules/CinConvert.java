package modules;
//char data type 
import java.util.ArrayList;

public class CinConvert {
//private ArrayList<String>  scanner_sc = new ArrayList<String>();
//private  ArrayList<String> in_t = new ArrayList<String>();
//private  ArrayList<String> floa_t= new ArrayList<String>();
//private  ArrayList<String> doubl_e= new ArrayList<String>();
//private  ArrayList<String> strin_g= new ArrayList<String>();

	String intTemplate = new String("= sc.nextInt()");
	String doubleTemplate = new String("= sc.nextDouble()");
	String floatTemplate = new String("= sc.nextFloat()");
	String stringTemplate = new String("= sc.nextLine()");
private ArrayList<String> datatypes= new ArrayList<String>();
private ArrayList<String> variables= new ArrayList<String>();
CinConvert(){
	//	scanner_sc.add("Scanner");scanner_sc.add("sc");scanner_sc.add("=");scanner_sc.add("new");scanner_sc.add("Scanner");scanner_sc.add("(");scanner_sc.add("System");scanner_sc.add(".");scanner_sc.add("in");scanner_sc.add(")");scanner_sc.add(";");
	//  in_t.add("=");in_t.add("sc");in_t.add(".");in_t.add("nextInt");in_t.add("(");in_t.add(")");in_t.add(";");
	//  floa_t.add("=");floa_t.add("sc");floa_t.add(".");floa_t.add("nextFloat");floa_t.add("(");floa_t.add(")");floa_t.add(";");
	//  doubl_e.add("=");doubl_e.add("sc");doubl_e.add(".");doubl_e.add("nextDouble");doubl_e.add("(");doubl_e.add(")");doubl_e.add(";");
	//  strin_g.add("=");strin_g.add("sc");strin_g.add(".");strin_g.add("nextInt");strin_g.add("(");strin_g.add(")");strin_g.add(";");
	
}
//this will run after character array conversion and class list conversion

private void getVarData(ArrayList<String> list){
	for(int i = 0; i< list.size()-1;i++)
	{
		if(list.get(i).equals("int") || list.get(i).equals("float") || list.get(i).equals("double") || list.get(i).equals("String"))
		{
			datatypes.add(list.get(i));
			
			variables.add(list.get(i+1));
		}
	}
}

private void doChangeCinPattern(ArrayList<String> list){
	getVarData(list);
	for(int i=1; i< list.size();i++)
	{
		for(int k=0;k<variables.size();k++)
			if(list.get(i).equals(">") && list.get(i-1).equals(variables.get(k)))
			{
				
			list.add(i,"cin"); 
			list.add(i,";");
			}
	}
	
}
public ArrayList<String> doCinConvert(ArrayList<String> classList)
{
	getVarData(classList);
	doChangeCinPattern(classList);
	ShowIt s = new ShowIt();
	getVarData(classList);
	/*for(int i = 0; i< classList.size()-1;i++)
	{
		if(classList.get(i).equals("int") || classList.get(i).equals("float") || classList.get(i).equals("double") || classList.get(i).equals("String"))
		{
			datatypes.add(classList.get(i));
			
			variables.add(classList.get(i+1));
		}
	} got all the variables with their datatypes  */
	//s.show(datatypes);
	int count = 0;
	for(int i=0; i< classList.size()-3;)
	{
		
		
			if(classList.get(i).equals("cin") && classList.get(i+1).equals(">") && classList.get(i+2).equals(">") && count == 0 )
			{
				count ++;
			//	while(!classList.get(i).equals(";"))
			//	{	
			//	for(int k=scanner_sc.size()-1; k>=0;k--)
				//	classList.add(i,scanner_sc.get(k));
				classList.add(i,"Scanner sc = new Scanner(System.in);"); // declared scanner object for first time
				i++;
				classList.remove(i);classList.remove(i);classList.remove(i); // removed cin>> for first time
				String datatype = new String();
				for(int var =0 ; var < variables.size();var++)
				{
					if(classList.get(i).equals(variables.get(var)))
					{
						 datatype = datatypes.get(var);
						
					}
				}
//				s.show(datatype+classList.get(i));
				i++;
				
		//		if(datatypes.equals("int") || datatypes.equals("float") || datatypes.equals("double") || datatypes.equals("String"))
				switch(datatype)
				{
				case "int":
					classList.add(i,intTemplate);
					break;
				case "float":
					classList.add(i,floatTemplate);
					break;
				case "double":
					classList.add(i,doubleTemplate);
					break;
				case "String":
					classList.add(i,stringTemplate);
					break;
				} 	i=i+2;
		//}
			}
			else if(classList.get(i).equals("cin") && classList.get(i+1).equals(">") && classList.get(i+2).equals(">") && count > 1)
				{	
				/*	count ++;
					classList.remove(i);classList.remove(i);classList.remove(i); // removed cin>> 
					String datatype = new String();
					for(int var =0 ; var < variables.size();var++)
					{
						if(classList.get(i).equals(variables.get(var)))
						{
							 datatype = datatypes.get(var);
							
						}
					}
					i++;
					switch(datatype)
					{
					case "int":
						classList.add(i,intTemplate);
						break;
					case "float":
						classList.add(i,floatTemplate);
						break;
					case "double":
						classList.add(i,doubleTemplate);
						break;
					case "String":
						classList.add(i,stringTemplate);
						break;*/
					// i=i+2;
				}
				
				
		}
	return classList;

}	
}
