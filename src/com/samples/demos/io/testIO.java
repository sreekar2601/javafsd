package com.samples.demos.io;


import java.io.IOException;
import java.util.*;
public class testIO {

	public static void main(String[] args) {
		System.out.println("This is output stream");
		System.err.println("This is an error message");
		
		try {
			int x=System.in.read();
			System.out.println((char)x);
			
		}catch(IOException e) {
			System.out.println("IO EXCEPTION while reading user input");
			e.printStackTrace();
		}

	}

}
