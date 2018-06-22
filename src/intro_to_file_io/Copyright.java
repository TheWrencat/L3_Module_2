package intro_to_file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Copyright {

	
	public static void main(String[] args) {
		File file = new File("src/intro_to_file_io/");
		
		
			FileWriter fw;
			try {
				for(File something: file.listFiles()) {
				fw = new FileWriter(something, true);
			
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			
			fw.write("//Copyright © 2018 by Wren Tolo");
				
			fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
//Copyright © 2018 by Wren Tolo