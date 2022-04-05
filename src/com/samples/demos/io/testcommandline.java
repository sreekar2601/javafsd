package com.samples.demos.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class testcommandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath="d:\\javafsd\\out\\testout.txt";
		String greeting=userinput();
		filewrite(filepath,greeting);
		
		

	}

	private static void filewrite(String filepath,String greeting) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter(filepath,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.println(greeting);
			pw.close();
			bw.close();
			fw.close();
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static String userinput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		String message="Greeting "+name;
		return message;
	}

}
