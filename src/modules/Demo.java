package modules;

import java.io.IOException;

public class Demo {
public static void main(String args[])throws IOException{
	CodeConverter obj = new CodeConverter("C:\\Users\\avishek\\Desktop\\CPP.txt");
	obj.doConvert();
}
}
