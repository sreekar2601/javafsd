package com.samples.demos.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testfileoutput {
	
	private static final String filepath="d:\\javafsd\\out\\testout.txt";
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//testout();
		//testout1();
		testout2();
		
		}
		

	

	private static void testout2() {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream(filepath);
			
			int i=0;
			//int count=0;
			while((i=fis.read())!=-1) {
				//count++;
				System.out.print((char)i);
				///if(count==13) break;
			}
			
			fis.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}




	private static void testout1() {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis=new FileInputStream(filepath);
			
			int i=fis.read();
			System.out.println((char)i);
			fis.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		
	}




	private static void testout() {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream(filepath);
			String s="hello world from java program";
			fos.write(s.getBytes());
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
