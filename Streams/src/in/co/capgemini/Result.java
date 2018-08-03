package in.co.capgemini;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;

public class Result {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\rituteja\\Desktop\\Ripudaman Singh\\Boy.txt");

		FileWriter write = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(write);
		Random rand = new Random();int i=0;
		for (i = 0; i < 100; i++) {
			writer.write((rand.ints(1, 50).findFirst().getAsInt()) + "\r\n");
		}
		System.out.println("Done");
		writer.close();

		FileReader read = new FileReader(file);

		BufferedReader reader = new BufferedReader(read);
		HashSet<Integer> set=new HashSet<Integer>();
		
		for (i = 0; i < 100; i++) {
			set.add(Integer.valueOf(reader.readLine()));
		}
        for(int set1:set)
        {
        	System.out.println(set1);
        }
	}

}
