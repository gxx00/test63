package com.gxx.t;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      File file=new File("d:/gxx/t1/t2/ttt.txt");
      FileReader fr=new FileReader(file);
      fr.skip(12);
//      fr.read();
      int first=fr.read();
      System.out.println((char)first);
//      char[] c=new char[10];
//      int count=0;
//      while ((count=fr.read(c))!=-1) {
//		String str=new String(c,0,count);
//		System.out.print(str);
//		
//	}
//      fr.close();
      
	}

}
