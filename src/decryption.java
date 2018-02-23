import java.io.BufferedReader;
import java.io.FileReader;


import javax.swing.JFileChooser;

public class decryption {
	public static void main(String[] args) {
				
			try {
			
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/encryptedText.txt"));
				String hiddenMessage = "";
				hiddenMessage += br.readLine();
				String clearedMessage = "";
				for (int i = 0; i < hiddenMessage.length(); i++) {
					char c = hiddenMessage.charAt(i);
					clearedMessage += (char) (c - 5);
				}
				br.close();
				System.out.println(clearedMessage);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}