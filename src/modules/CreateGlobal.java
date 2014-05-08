import java.util.ArrayList;

class CreateGlobal{

    private ArrayList<String> template = new Arraylist<String>();
    int i, count =0,startpos;
    public ArrayList<String> doCreateGlobal(ArrayList<String> srcList){
        template.add("public");
        template.add("class");
        template.add("GlobalVar");
        template.add("{");
        template.add("public");
        template.add("}");
        for(i=0;i<srcList.size();i++)
        {
            if(srcList.get(i).equals("{")
              count ++;
            else if(srcList.get(i).equals("}")
              count --;
            else if(count == 0 && (srcList.get(i).equals("int") || srcList.get(i).equals("float") || srcList.get(i).equals("double") || srcList.get(i).equals("char"))
            { 
              startpos=i;
              do
              {
                template.add(srcList.get(i));
                srcList.remove(i);
              
              }while(!srcList.get(i).equals(";"));
            }
  
  }for(int k = 0; k < template.size();k++)
  {
  while(template.isEmpty())
    { 
      
      srcList.add(startpos++,template.get(k));
    }
  }
  }
  }
