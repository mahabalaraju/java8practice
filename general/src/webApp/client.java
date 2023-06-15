package webApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {

		Socket socket=null;
		InputStreamReader inputStreamreader=null;
		OutputStreamWriter outputstreamwriter=null;
		BufferedWriter bufferedwriter=null;
		BufferedReader bufferedreader=null;
		try {
			 socket =new Socket("localhost",1232);
			
			 inputStreamreader=new InputStreamReader(socket.getInputStream());
			 outputstreamwriter=new OutputStreamWriter(socket.getOutputStream());
			 
			 bufferedwriter =new BufferedWriter(outputstreamwriter);
			 bufferedreader =new BufferedReader(inputStreamreader);
			 
			 Scanner sc =new Scanner(System.in);
			 
			 while(true) {
				 String msgtosend=sc.next();
				 bufferedwriter.write(msgtosend);
				 bufferedwriter.newLine();
			     bufferedwriter.flush();
			     
			     System.out.println("server: "+bufferedreader.readLine());
			     
			     if(msgtosend.equalsIgnoreCase("bye"))
			    	 break;
			  	}
		}
		catch(IOException e){
		e.printStackTrace();	
		}
	finally {
		try {
			if(socket!=null) {
				socket.close();
			}
			if(inputStreamreader!=null) {
				inputStreamreader.close();
			}
			if(outputstreamwriter!=null) {
			outputstreamwriter.close();
			}
			if(bufferedreader!=null)
			{
				bufferedreader.close();
			}
			if(bufferedwriter!=null)
			{
				bufferedwriter .close();
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
		}

}
