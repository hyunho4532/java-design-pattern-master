package decorater_pattern.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) {
		int c;
		
		try {
			InputStream inputStream = new LowerCaseInputStream (
					new BufferedInputStream(
							new FileInputStream("test.txt")));
			
			while ((c = inputStream.read()) >= 0) {
				System.out.println((char)c);
			}
			
			inputStream.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}