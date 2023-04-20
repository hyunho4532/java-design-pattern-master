package decorater_pattern.IO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
	
	public LowerCaseInputStream(InputStream inputStream) {
		super(inputStream);
	}
	
	@Override
	public int read() throws IOException {
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	@Override
	public int read(byte[] b, int offSet, int len) throws IOException {
		int result = in.read(b, offSet, len);
		
		for (int i = offSet; i < offSet + result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		
		return result;
	}
}
