package objectadapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdapterWithBufferedReader {
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		try {
			String str = bufferedReader.readLine();
			System.out.println("Your name is " + str);
		} catch (Exception e) {
			throw new RuntimeException("Error when enter name");
		}
	}
	
	// Adaptee: System.in
	// Target: BufferedReader
	// Adapter: InputStreamReader
}
