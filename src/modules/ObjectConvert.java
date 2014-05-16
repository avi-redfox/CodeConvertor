package modules;


// works perfectly fine
import java.util.ArrayList;

public class ObjectConvert {

		int i,j,startpos;
		ArrayList<String> className;
		ArrayList<String> template1;
		ArrayList<String> template2;
		ClassNames cname= new ClassNames();
		public ArrayList<String> doObjectConvert(ArrayList<String> srcList)
		{		
				className = cname.createClassName(srcList);
				System.out.println("class names creadted");
				for(i=0; i < srcList.size()-2; i++ )
				{	
					
					template1 = fillTemplate1();
					template2 = fillTemplate2();
					
					
					for(j=0; j < className.size() ; j++)
					{
						if(srcList.get(i).equals(className.get(j)))
						{	
							startpos = i;
							if(srcList.get(i+2).equals(";"))
							{
								
								template1.remove(0);
								template1.add(0,srcList.get(i));
								template1.remove(1);
								template1.add(1, srcList.get(i+1));
								template1.remove(4);
								template1.add(4, srcList.get(i));
								j=1;
								do {
									srcList.remove(i);
									j++;
								}while(j<4);
								for(int k=template1.size()-1 ; k>=0;k--)
									srcList.add(i, template1.get(k));
							}
							else 
							
								if(srcList.get(i+2).equals("["))
								{
									String classname=srcList.get(i);
									String var = srcList.get(i+1);
									String number = srcList.get(i+3);
									for(int k=0;k< template2.size();k++)
									{
										if(template2.get(k).equals("class"))
										{
											template2.remove(k);
											template2.add(k,classname);
										}
										else if(template2.get(k).equals("var"))
										{
											template2.remove(k);
											template2.add(k,var);
										}
										else if(template2.get(k).equals("number"))
										{
											template2.remove(k);
											template2.add(k,number);
										}
									}j=1;
									do{
										srcList.remove(i);
										j++;
									}while(j<7);
									for(int k=template2.size()-1 ; k>=0;k--)
										srcList.add(i, template2.get(k));
								}
							
							}
						}
				}return srcList;
				
		}
		public  ArrayList<String> fillTemplate1()
		{
			ArrayList<String> template = new ArrayList<String>();
			template.add("class");
			template.add("var");
			template.add("=");
			template.add("new");
			template.add("class");
			template.add("(");
			template.add(")");
			template.add(";");
			return template;
		}
		public  ArrayList<String> fillTemplate2()
		{
			ArrayList<String> template = new ArrayList<String>();
			template.add("class");
			template.add("var");
			template.add("[");
			template.add("]");
			template.add("=");
			template.add("new");
			template.add("class");
			template.add("[");
			template.add("number");
			template.add("]");
			template.add(";");
			template.add("for");
			template.add("(");
			template.add("int");
			template.add("i");
			template.add("=");
			template.add("0");
			template.add(";");
			template.add("i");
			template.add("<");
			template.add("number");
			template.add(";");
			template.add("i");
			template.add("+");
			template.add("+");
			template.add(")");
			template.add("var");
			template.add("[");
			template.add("i");
			template.add("]");
			template.add("=");
			template.add("new");
			template.add("class");
			template.add("(");
			template.add(")");
			template.add(";");
			return template;
		}
}
