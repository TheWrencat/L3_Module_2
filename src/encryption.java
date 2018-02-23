
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class encryption {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("Input message to encrypt.");
		// put encryption here
		String scrambled = "";
		for (int i = 0; i < message.length(); i++) {
			char c = message.charAt(i);
			scrambled += (char) (c + 5);
		}

		try {
			FileWriter file = new FileWriter("src/intro_to_file_io/encryptedText.txt");
			file.write(scrambled);
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
