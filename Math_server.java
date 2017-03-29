import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;

public class Math_server {
	Socket socket;
	public void setSocket(Socket socket){
		this.socket = socket;
	}

		/*******		Main	Method		********/
	public static void main(String[] arg) throws IOException{
		int port = 10000;
		if(arg.length == 1){
			try{
				port = Integer.parseInt(arg[0]);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Math Server is running....");
		ServerSocket serversocket = new ServerSocket(port);
		Socket socket = serversocket.accept();
		Math_server mathServer = new Math_server();
		mathServer.setSocket(socket);
		mathServer.execution();
		System.out.println("\nMath server is closed....");
	}
	
	public void execution(){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = reader.readLine();
			double result = ParseException(line);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			writer.write("" + result);
			writer.newLine();
			writer.flush();
			writer.close();
			reader.close();
		}catch(Exception e){
			System.out.println("Execution error!!!!");
		}
	}

	private double ParseException(String line) {
		double result = Double.MAX_VALUE;
		String[] element = line.split(":");
		if(element.length != 3)
			throw new IllegalArgumentException();
		double firstvalue = 0;
		double secondvalue = 0;
		try{
			firstvalue = Double.parseDouble(element[1]);
			secondvalue = Double.parseDouble(element[2]);
		}catch(Exception e){
			throw new IllegalArgumentException();
		}
		switch(element[0].charAt(0)){
		case '+':
			result = firstvalue + secondvalue;
			break;
		case '-':
			result = firstvalue - secondvalue;
			break;
		case '*':
			result = firstvalue * secondvalue;
			break;
		case '/':
			result = firstvalue / secondvalue;
			break;
			default:
				throw new IllegalArgumentException();
		}
		return result;
	}
}