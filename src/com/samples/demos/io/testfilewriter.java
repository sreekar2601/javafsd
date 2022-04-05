package com.samples.demos.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class testfilewriter {
	private static final String filepath="d:\\javafsd\\out\\testout.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//filewrite();
		//bufferedwrite();
		printwriter();
		appenddata();
		

	}

	private static void appenddata() {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter(filepath,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.println("appending the new line");
			pw.close();
			bw.close();
			fw.close();
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void printwriter() {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter(filepath);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.println("sample using print writer");
			bw.close();
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void bufferedwrite() {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter(filepath);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("sample using buffered writer");
			bw.close();
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void filewrite() {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter(filepath);
			fw.write("thiis is from file writer");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
