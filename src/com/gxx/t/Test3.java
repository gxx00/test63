package com.gxx.t;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Test3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       File file=new File("d:/gxx/t1/t2/tttt.txt");
       File srcfile=new File("d:/gxx/t1/t2/tttt1.doc");
       int total=(int) (file.length()/2);//总大小 82  41
       //文件大小 是 操作系统
       FileReader fr=new FileReader(file);
       FileWriter fw=new FileWriter(srcfile,true);
       char[] c=new char[10];
       double temp=0;//已经读了字符个数
       int count=0;
       while((count=fr.read(c))!=-1){
    	  fw.write(c,0,count);
    	  fw.flush();
    	  temp+=count;
    	  //读到换行符的时候  4个字节  2个字符
    	  System.out.println(new String(c,0,count));
    	  System.out.println(temp);
    	  System.out.println(temp/total*100+"%");
       }
       fr.close();
       fw.close();
       
	}

}
