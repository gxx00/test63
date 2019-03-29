package com.gxx.t;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("请输入身份证号码");
      String id=sc.next();
      
      String id1=id.substring(0,6);
      BufferedReader br=new BufferedReader(new FileReader(new File("d:/全国身份证号码归属地查询.txt")));
      String line=null;
      System.out.println(br.readLine());
//      while((line=br.readLine())!=null){
//    	  String[] str=line.split(" ");
//    	  if(str[0].equals(id1))
//    	  {   
//    		  String temp=new String(str[1].getBytes(),"UTF-8");
//    		  System.out.println(temp);
//    		  break;
//    	  }
//      }
      br.close();
      
      
      
      
      
      
      
      
      
      
      
	}

}
