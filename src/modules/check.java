package modules;

import java.io.*;
import java.util.ArrayList;

public class check {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> src=new ArrayList<String>();			
		ArrayList<String> classes=new ArrayList<String>();			
		ShowIt Show = new ShowIt();
		//********************************************
			Starter s = new Starter();
			s.read("C:\\Users\\avishek\\Desktop\\CPP.txt");
			src=s.getSrcList();
		//********************************************
		
		//****************Removing PreProcessorDirective*****************************
				PreProcessorDirectiveRemove pRem = new PreProcessorDirectiveRemove();
				src = pRem.removePreProcessorDirective(src);
				s.setSrcList(src);
				src=s.getSrcList(); 
				Show.show(s.getSrcList());
		//****************************************************************************
		
		//****************Class List***********************
				ClassNames cn=new ClassNames();
				classes = cn.createClassName(src);
				//Show.show(classes);
		//*************************************************
				
		
		//****************OutLine To InLine***********************************
				//OutlineToInlineNew oi = new OutlineToInlineNew();
				//Show.show(src);
				//src=oi.doOutlineToInline(src,classes);
				//Show.show(src);
		//*************************************************
				
}}
