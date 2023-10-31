package lab6b;

import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class LowerCaseInputStream extends FilterInputStream{

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	/*
	 * We should override the read method from FilterInputStream t 
	 * o take a byte and convert each byte (that represents a character) 
	 * to lowercase if it is an uppercase character.
	 */
	@Override
	public int read() throws IOException {
		int i = super.read();
		if(i < 0) {
			return i;
		}
		return Character.toLowerCase((char)i);
	}
	
}