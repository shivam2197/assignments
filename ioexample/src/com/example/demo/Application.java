package com.example.demo;

import java.io.File;

import com.example.demo.services.ProfessorService;
import com.example.model.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("professor.ser");
		
		File txtFile=new File("prof3.txt");
		
		int key=4;
		
		ProfessorService service=new ProfessorService();
	
		if(key ==1) {
			
		Professor prof[]=new Professor[2];
		
			
		prof[0]=new Professor(3838,"Suresh","ECE","phd");
		prof[1]=new Professor(3897,"Ramesh","CSE","phd");
	
		
		boolean result=service.writeObjectToFile(prof, file);
		
		if(result) {
			System.out.println(" Object Serialized");
		}else {
			System.out.println("Check- Exception");
		}
		}
	
	
	if(key == 2) {
		
		Professor prof[]=(Professor[])service.readObjectFromFile(file);
		for(Professor eachProf: prof)
		System.out.println("Deserialized: "+eachProf);
		
	}
	if(key == 3) {
		Professor suraj=new Professor(3840,"Suraj","ECE","phd");
		Professor rakesh=new Professor(3810,"Rakesh","CSE","phd");
		Professor rajesh=new Professor(3820,"Rajesh","Mech","phd");
		System.out.println("Is added:="+ service.writeToTextFile(suraj, txtFile));
		System.out.println("Is added:="+ service.writeToTextFile(rakesh, txtFile));
		System.out.println("Is added:="+ service.writeToTextFile(rajesh, txtFile));
	}
	if(key == 4) {
		Professor[] list=service.readFromTextFile(txtFile);
		
		for(Professor eachProf : list) {
			if(eachProf!=null) {
				System.out.println(eachProf);
			}
		}
	}
	}
}
