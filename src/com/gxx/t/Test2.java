package com.gxx.t;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File file=new File("d:/gxx/t1/t2/tttt.txt");
        
        FileWriter fw=new FileWriter(file,true);
        
        String text="我是如来佛祖玉皇大帝，指定去西天取经，花果山水帘洞，齐天大圣孙悟空啊！\r\n帅的掉渣！";
        fw.write(text);
        fw.flush();
        fw.close();
        
        
        
	}

}
