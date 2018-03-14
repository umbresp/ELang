import java.io.*;
import java.util.Scanner;

public class Compile {
	public static void main(String[] args) {
		if (args.length > 0) {
			// Compile
			if (args[0].endsWith(".e")) {
				// Compile
				try {
					File file = new File(args[0]);
					FileInputStream fis = new FileInputStream(file);
					byte[] data = new byte[(int) file.length()];
					fis.read(data);
					fis.close();

					String str = new String(data, "UTF-8");

					/*
					java.io.File file = new java.io.File(args[0]);
					Scanner input = new Scanner(file);
					String str = "";

					while (input.hasNext()) {
						str += input.next();
					}

					input.close();
					*/

					String[] array = str.split("\\s+");
					char[] output = new char[array.length];
					for (int i = 0; i < array.length; i++) {
						int len = array[i].length();
						char ch = (char) len;
						output[i] = ch;
					}

					for (int i = 0; i < output.length; i++) {
						System.out.print(output[i]);
					}
					System.out.println();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			else {
				System.out.println("Invalid file.");
			}
		}
		else {
			System.out.println("No file specified.");
		}
	}
}