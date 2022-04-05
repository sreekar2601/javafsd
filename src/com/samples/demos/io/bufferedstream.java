package com.samples.demos.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedstream {

	private static final String filepath="d:\\javafsd\\out\\testout.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bufferedoutput();

	}
	private static void bufferedoutput() {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream(filepath);
			BufferedOutputStream boi=new BufferedOutputStream(fos);
			String s="This is from buffered stream";
			byte[] b=s.getBytes();
			boi.write(b);
			boi.flush();
			boi.flush();
			fos.close();
			System.out.println("End");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException ex)
		{
			ex.printStackTrace();
	}
		
	}

}
