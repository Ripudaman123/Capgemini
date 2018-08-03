package com.capgemini;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.swing.filechooser.FileFilter;
//Return all subdirectories of a given directory using Lambda Expression
public class FileLambda1 {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\rituteja");
	
		if(!file.isDirectory()) {
			System.out.println("Not a directory");
		   return;
		}
		
		List<File> directories1=Arrays.asList(file.listFiles(File::isDirectory));
		directories1.forEach(System.out::println); //using Lambda Expression
		
	}

}
