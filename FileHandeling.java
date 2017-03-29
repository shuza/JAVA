import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandeling {
	public static void main(String[] arg) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("D:\\in.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("D:\\out.txt"));
		while(in.ready()){
			out.write(in.readLine());
		}
		out.close();
	}
}