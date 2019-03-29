package com.gxx.t;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

public class Test4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File file=new File("./com/gxx/t/Test1.java");
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line=null;
        while((line=br.readLine())!=null)
        {
        	System.out.println(line);
        }
        
        fr.close();
        br.close();
        
        		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
