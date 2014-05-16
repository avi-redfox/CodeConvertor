package modules;

import java.io.IOException;
import java.util.ArrayList;

public class CodeConverter {
public String fileName;

CodeConverter(String name){
	fileName=name;
}
public void doConvert()throws IOException{
	ArrayList<String> srcList = new ArrayList<String>();
	Starter s = new Starter();
	s.read(fileName);
	srcList = s.getSrcList();
	
	System.out.println("File has been read.");
	PreProcessorDirectiveRemove p = new PreProcessorDirectiveRemove();
	srcList = p.removePreProcessorDirective(srcList);
	System.out.println("Preprocessor Removed");
	ResolveMain rm = new ResolveMain();
	srcList = rm.doResolveMain(srcList);
	System.out.println("Main Resolved");
	ObjectConvert oc = new ObjectConvert();
	srcList = oc.doObjectConvert(srcList);
	System.out.println("Objects Created");
	CoutConvertMy cc = new CoutConvertMy();
	srcList = cc.doCoutConvert(srcList);
	System.out.println("Cout converted");
	CinConvert cincon = new CinConvert();
	srcList = cincon.doCinConvert(srcList);
	System.out.println("Cin converted");
	WriteFile ob = new WriteFile();
	ob.writeFile(srcList); 
	System.out.println("File written");
	
	
}
}
