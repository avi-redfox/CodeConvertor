package modules;

import java.util.ArrayList;

public class OutlineToInlineNew {
	private ArrayList<String> outline=new ArrayList<String>();
	private int count=0;
	
	public ArrayList<String> getOutline() 
	{
		return outline;
	}

	public int getCount() 
	{
		return count;
	}
	
	public ArrayList<String> doOutlineToInline(ArrayList<String> srcList,ArrayList<String> className){
		int t = 0;
		int x = 0;
		int count=0;
		ShowIt s = new ShowIt();
		ShowIt show = new ShowIt();
		show.show(className);
		for(int j=0;j<className.size();j++)
		{
			ArrayList<String> functionName=new ArrayList<String>();//creating function list for each class
			for(int i=0;i<srcList.size()-2;)
			{
				if(srcList.get(i).equals(className.get(j))&&srcList.get(i+1).equals(":")&&srcList.get(i+2).equals(":"))
					{
					i--;
					srcList.remove(i);
					srcList.remove(i);
					srcList.remove(i);
					srcList.remove(i);
					int k=i;
					count = 0;
					String br = new String();
					do
					{						
						br = srcList.get(k);
						if(br.equals("("))
						{
							count++;
							functionName.add(br);
							srcList.remove(k);						
						}
						else if(br.equals(")"))
						{
							count--;
							functionName.add(br);
							srcList.remove(k);
						
						}
						else
						{
							functionName.add(br);
							srcList.remove(k);
						
						}
					}
					while(!(count==0&&br.equals(")")));
					functionName.add("/*FunctionNameEnd*/");
					
					//***************{copy whole OUTLINE function}**************
					//***************as well as remove from the list************
					count = 0;
					String body = new String();
					do
					{				
						body = srcList.get(i);					
					if(i<srcList.size()&&body.equals("{"))
					{
						outline.add(body);//copy {
						srcList.remove(i);//delete {
						count++;
					}
					else if(i<srcList.size()&&body.equals("}"))
					{
						outline.add(srcList.get(i));//copy }
						srcList.remove(i);//delete }
						count--;
					}
					else if(i<srcList.size()&&count!=0)
					{
						outline.add(srcList.get(i));//cop
						srcList.remove(i);//delete other code
					}
					}while(count!=0&&!body.equals("}"));
					//***************{copy whole OUTLINE function}**************
					//*************** completed ************
								
				}
				else 
					i++;					
			}
			int k = 0;
//**************** now I have all FUNCTION list and there BODY List********************************
			for(int i=0;i<srcList.size();)
			{
				k = 0;
				count =0;
				String br =new String();
				if(i<srcList.size()&&k<functionName.size()&&functionName.get(0).equals(srcList.get(i)))
				{
					do
					{
						br = srcList.get(i);
						if(k<functionName.size()&&functionName.get(k).equals(br))
						{
							k++;
							i++;
							if(br.equals("(")) 
								count++;
							else if(br.equals(")")) 
								count--;
						}
						else
							break;
					}
					while(!(count==0&&br.equals(")")));
				////////////////////////////////////////////////////////////////	
				}
				else 
					i++;
				//////////////////////////////////////////////////////////////////
				if(count==0&&br.equals(")")&&srcList.get(i).equals(";"))
				{
					for(k=0;k<functionName.size()&&!functionName.get(k).equals("/*FunctionNameEnd*/");)
					{
						//s.show(functionName.get(k));//	
						functionName.remove(k); //<---------------------||
					}							//						||
					//s.show(functionName.get(k));//					||
												//						||
												//						||
					functionName.remove(k); //   /*FunctionNameEnd*/	||
//************************ FUNCTION name removed from function name list******************************************************					
					String body = new String();
					srcList.remove(i);
					k=0;
					do
					{
							body = outline.get(k);
							if(i<srcList.size()&&body.equals("{"))
							{
							srcList.add(i,body);
							outline.remove(k);
							count++;
							i++;
						}
							else if(i<srcList.size()&&body.equals("}"))
							{
							srcList.add(i,body);
							outline.remove(k);
							count--;
							i++;
						}
							else if(i<srcList.size()&&count!=0)
							{
							srcList.add(i,body);
							outline.remove(k);
							i++;
						}					
					}
					while((count!=0&&!body.equals("}")));						
				}		
				
			}
		}
		return srcList;
	}
}
	