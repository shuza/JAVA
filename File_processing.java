import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_processing {
	public static void main(String[] arg) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("D:\\in.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter(new File("D:\\out.txt")));
		while(in.ready()){
			String line = in.readLine();
			System.out.println(line);
			out.write(line);
		}
	}
}